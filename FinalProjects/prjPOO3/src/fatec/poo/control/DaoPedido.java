/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ichla
 */
public class DaoPedido {
    private Connection conn;
    
    public DaoPedido(Connection conn) {
         this.conn = conn;
    }    
    
    public Pedido consultar (String numeroPedido) {
        Pedido objPedido = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_pedido where numeroPedido = ?");
            
            ps.setString(1, numeroPedido);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objPedido = new Pedido(rs.getString("numeroPedido"));
                objPedido.setDataEmissao(rs.getString("dataEmissao"));
                objPedido.setValorPedido(rs.getDouble("valorPedido"));
                
                String cpfCliente = rs.getString("cpfCliente");
                String cpfVendedor = rs.getString("cpfVendedor");

                DaoCliente daoCliente = new DaoCliente(conn);
                Cliente cliente = daoCliente.consultar(cpfCliente);
                objPedido.setCliente(cliente);

                DaoVendedor daoVendedor = new DaoVendedor(conn);
                Vendedor vendedor = daoVendedor.consultar(cpfVendedor);
                objPedido.setVendedor(vendedor);
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objPedido;
    } 
     
    public void inserir(Pedido objPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_pedido VALUES(?,?,?,?,?)");
            ps.setString(1, objPedido.getNumeroPedido());
            ps.setString(2, objPedido.getDataEmissao());
            ps.setDouble(3, objPedido.getValorPedido());
            ps.setString(4, objPedido.getCliente().getCpf());
            ps.setString(5, objPedido.getVendedor().getCpf());
                  
            ps.execute(); //envia a instrução SQL para o SGBD
            
            ps = conn.prepareStatement("UPDATE tb_cliente set limiteDisponivel = ? where cpf = ?");
            ps.setDouble(1, objPedido.getCliente().getLimiteDisponivel());
            ps.setString(2, objPedido.getCliente().getCpf());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Pedido pedido) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tb_pedido set dataEmissao = ?, " 
                                        + "valorPedido = ?, " + "where numeroPedido = ?");
            
            ps.setString(1, pedido.getDataEmissao());
            ps.setDouble(2, pedido.getValorPedido());
            ps.setString(3, pedido.getNumeroPedido());
            
            ps.execute(); //Envia a instrução SQL para o SGBD
            
            ps = conn.prepareStatement("UPDATE tb_cliente set limiteDisponivel = ? where cpf = ?");
            ps.setDouble(1, pedido.getCliente().getLimiteDisponivel());
            ps.setString(2, pedido.getCliente().getCpf());
            
            
           
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_cliente set limiteDisponivel = ? where cpf = ?");
            ps.setDouble(1, pedido.getCliente().getLimiteDisponivel() + pedido.getValorPedido());
            ps.setString(2, pedido.getCliente().getCpf());
            ps.execute();
            
            
            ps = conn.prepareStatement("DELETE FROM tb_pedido where numeroPedido = ?");
            ps.setString(1, pedido.getNumeroPedido());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
