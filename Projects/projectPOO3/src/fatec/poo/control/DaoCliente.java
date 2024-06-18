
package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ichla
 */
public class DaoCliente {
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }    
    
    public Cliente consultar (String cpf) {
        Cliente objCliente = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_cliente where cpf = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objCliente = new Cliente(rs.getString("cpf"),rs.getString("nome"), rs.getDouble("limiteCredito"));
                objCliente.setEndereco(rs.getString("endereco"));
                objCliente.setCidade(rs.getString("cidade"));
                objCliente.setUf(rs.getString("uf"));
                objCliente.setTelefone(rs.getString("telefone"));
                objCliente.setCep(rs.getString("cep"));
                objCliente.setLimiteCredito(rs.getDouble("limiteCredito"));
                objCliente.setLimiteDisponivel(rs.getDouble("limiteDisponivel"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objCliente;
    }    
     
    public void inserir(Cliente objCliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_cliente VALUES(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, objCliente.getCpf());
            ps.setString(2, objCliente.getNome());
            ps.setString(3, objCliente.getEndereco());
            ps.setString(4, objCliente.getCidade());
            ps.setString(5, objCliente.getUf());
            ps.setString(6, objCliente.getTelefone());
            ps.setString(7, objCliente.getCep());
            ps.setDouble(8, objCliente.getLimiteCredito());
            ps.setDouble(9, objCliente.getLimiteDisponivel());
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tb_cliente set endereco = ?, " + "cidade = ?, " +
                                       "uf = ?, " + "telefone = ?, " + "cep = ?, " +
                                       "limiteCredito = ?, " + "limiteDisponivel = ? " +
                                        "where cpf = ?");
            
            ps.setString(1, cliente.getEndereco());
            ps.setString(2, cliente.getCidade());
            ps.setString(3, cliente.getUf());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getCep());
            ps.setDouble(6, cliente.getLimiteCredito());
            ps.setDouble(7, cliente.getLimiteDisponivel());
            ps.setString(8, cliente.getCpf());
           
           
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_cliente where cpf = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}