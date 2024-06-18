package fatec.poo.control;

import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ichla
 */
public class DaoVendedor {
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }    
    
    public Vendedor consultar (String cpf) {
        Vendedor objVendedor = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_vendedor where cpf = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objVendedor = new Vendedor(rs.getString("cpf"),rs.getString("nome"), rs.getDouble("salarioBase"));
                objVendedor.setEndereco(rs.getString("endereco"));
                objVendedor.setCidade(rs.getString("cidade"));
                objVendedor.setUf(rs.getString("uf"));
                objVendedor.setDdd(rs.getString("ddd"));
                objVendedor.setTelefone(rs.getString("telefone"));
                objVendedor.setCep(rs.getString("cep"));
                objVendedor.setSalarioBase(rs.getDouble("salarioBase"));
                objVendedor.setTaxaComissao(rs.getDouble("taxaComissao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objVendedor;
    }    
     
    public void inserir(Vendedor objVendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_vendedor VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, objVendedor.getCpf());
            ps.setString(2, objVendedor.getNome());
            ps.setString(3, objVendedor.getEndereco());
            ps.setString(4, objVendedor.getCidade());
            ps.setString(5, objVendedor.getUf());
            ps.setString(6, objVendedor.getDdd());
            ps.setString(7, objVendedor.getTelefone());
            ps.setString(8, objVendedor.getCep());
            ps.setDouble(9, objVendedor.getSalarioBase());
            ps.setDouble(10, objVendedor.getTaxaComissao());
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tb_vendedor set endereco = ?, " + "cidade = ?, " +
                                       "uf = ?, " + "ddd = ?," + "telefone = ?, " + "cep = ?, " +
                                       "salarioBase = ?, " + "taxaComissao = ? " +
                                        "where cpf = ?");
            
            ps.setString(1, vendedor.getEndereco());
            ps.setString(2, vendedor.getCidade());
            ps.setString(3, vendedor.getUf());
            ps.setString(4, vendedor.getDdd());
            ps.setString(5, vendedor.getTelefone());
            ps.setString(6, vendedor.getCep());
            ps.setDouble(7, vendedor.getSalarioBase());
            ps.setDouble(8, vendedor.getTaxaComissao());
            ps.setString(9, vendedor.getCpf());
           
           
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_vendedor where cpf = ?");
            
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
