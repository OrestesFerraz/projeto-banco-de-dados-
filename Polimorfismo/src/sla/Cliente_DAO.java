
package sla;


public class Cliente_DAO {
    
    public String mostrar_info (Cliente_DTO cliente_DTO) {
        return "o nome informado foi " + cliente_DTO.getNome() +
                "\n o gr informado foi " + cliente_DTO.getRg() +
                verifica(cliente_DTO.getIdade()) +
                verifica(cliente_DTO.getAltura());
        
    }//metodo
    
    private String verifica (int idade) {
        if (idade > 18) {
            return "\n a idade é maior que 18 você pode entrar no briquedo";
        } else {
            return "\n a idade é menor que 18 voccê não pode entrar no briquedo";
        }//else
        
    }//verifica
    
    private String verifica (double altura) {
        if (altura > 1.50) {
            return "\n a altura é maior que 1.50 você pode entrar no briquedo";
        } else {
             return "\n a altura é menor que 1.50 voccê não pode entrar no briquedo";
        }// else
        
    }//verifica
    
}//classe
