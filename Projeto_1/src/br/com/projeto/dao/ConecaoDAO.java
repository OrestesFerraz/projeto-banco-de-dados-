
package br.com.projeto.dao;

import java.sql.*;

public class ConecaoDAO {
    //variavel de conexao
    public static Connection con = null;
    
    public ConecaoDAO () {
    }//metodo construtor
    
    public static void conectDB () {
        
        try {
            
            String dsn = "projeto_1"; //projeto
            String user = "postgres"; //usuario
            String senha = "postdba"; //senha do banco de dados 
            
            DriverManager.registrerDriver(new org.postgressql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn; //url do banco de dados
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false); //nao comitar automaticamente
            
            if (con == null) { // se a requisição for nula deve informar
                
                System.out.println("erro ao entrar no banco de dados");
                
            }//if
            
        } catch(Exception e) { //mensagem de erro (caso dê)
            
            System.out.println("problema ao abrir a base do banco de dados!" +
                    e.getMessage());
            
        }//catch
        
    }//metodo connect db
    
    public static void CloseDB () { //metodo que fecha o banco de dados
        try {
            con.close();
        } catch (Exception e) { //mensagem de erro (caso dê)
            System.out.println("prohblema ao fechar a base do banco de dados!");
        }
        
    }//metodo clode db
    
}//classe
