package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ichla
 */
public class DaoAluno {
    private Connection conn;
    
    public DaoAluno(Connection conn) {
        this.conn = conn;
    }
    public Aluno consultar(int ra) {
        Aluno objAluno = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement ("SELECT * FROM tb_aluno where ra = ?");
            
            ps.setInt(1, ra);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true) {
                objAluno = new Aluno(rs.getInt("ra"), rs.getString("nome"));
                objAluno.setNotaP1(rs.getDouble("notaP1"));
                objAluno.setNotaP2(rs.getDouble("notaP2"));
            }     
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return objAluno;
    }
    //
    //
    public void inserir(Aluno objAluno) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_aluno VALUES(?,?,?,?)");
            ps.setInt(1, objAluno.getRA());
            ps.setString(2, objAluno.getNome());
            ps.setDouble(3, objAluno.getNotaP1());
            ps.setDouble(4, objAluno.getNotaP2());
            
            ps.execute();
            
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //
    //
    public void alterar(Aluno aluno) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tb_aluno SET nome = ?, " +
                                       "notaP1 = ?, " + "notaP1 = ?, " +
                                       "where ra = ?");
            ps.setString(1, aluno.getNome());
            ps.setDouble(2, aluno.getNotaP1());
            ps.setDouble(3, aluno.getNotaP2());
            ps.setInt(4, aluno.getRA());
            
            ps.execute();
        
        } catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //
    //
    public void excluir(Aluno aluno) {
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_aluno WHERE ra = ?");
            ps.setInt(1, aluno.getRA());
            
            ps.execute();
            
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
