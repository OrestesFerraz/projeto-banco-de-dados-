
package sla;

import javax.swing.JOptionPane;

public class Cliente_view {
    
    public static void main (String[] args) {
        Cliente_DTO cliente_DTO = new Cliente_DTO();
        Cliente_CTR cliente_CTR = new Cliente_CTR();
        
        cliente_DTO.setNome(
                JOptionPane.showInputDialog("informe o nome"));
        
         cliente_DTO.setRg(
                JOptionPane.showInputDialog("informe o rg"));
         
          cliente_DTO.setAltura(
                Double.parseDouble(JOptionPane.showInputDialog("informe a altura")));
         
          cliente_DTO.setIdade(
                Integer.parseInt(JOptionPane.showInputDialog("informe a idade")));
          
         JOptionPane.showMessageDialog(null,
                 cliente_CTR.mostrar_info(cliente_DTO));
    }
}
