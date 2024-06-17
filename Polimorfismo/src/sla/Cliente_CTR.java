
package sla;


public class Cliente_CTR {
    
    
    
    public String mostrar_info (Cliente_DTO cliente_DTO) {
        Cliente_DAO cliente_DAO = new Cliente_DAO();
        
        return cliente_DAO.mostrar_info(cliente_DTO);
    }
}
