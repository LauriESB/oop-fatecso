/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ichla
 */
public class Conexao {
    private String connectionString;
    private String driver;
    private String usuario;
    private String senha;
    
    private Connection connection = null;
    
    public Conexao(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }

    
    public Connection abrirConexao() {
        if(connection == null) {
            try {
                Class.forName(driver);
                
                connection = DriverManager.getConnection(connectionString, usuario, senha);
                System.out.println("[Conexão OK]");
            } catch(Exception ex) {
                System.out.println("Falha na abertura da conexão");
                System.out.println(ex.toString() + ex.getMessage());
            }
        
        }
        return connection;
    }
    
    public void fecharConexao() {
        try {
            connection.close();
            System.out.println("[Conexão Encerrada]");
        }catch(Exception ex) {
            System.out.println("Falha no encerramento da conexao");
            System.out.println(ex.toString() + ex.getMessage());
        }
    }
}
