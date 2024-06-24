package fatec.poo.control;

import fatec.poo.model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ichla
 */
public class DAODepartment {
    private Connection conn;
    
    public DAODepartment(Connection conn) {
        this.conn = conn;
    }
    public Department search(String abrev) {
        Department d = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("select * from tb_department where abrev = ?");
            
            ps.setString(1, abrev);
            ResultSet rs  = ps.executeQuery();
            
            if (rs.next() == true) {
                d = new Department (abrev, rs.getString("name"));
            }
        }catch(SQLException e) {
            System.out.println(e.toString());
        }
        return d;
    }
    
    public void insert(Department department) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into tb_department values (?,?)");
            ps.setString(1, department.getAbbreviation());
            ps.setString(2, department.getName());
        }catch(SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void update(Department department) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("update tb_department set name = ? where abrev = ?");
            ps.setString(1, department.getName());
            ps.setString(2, department.getAbbreviation());
            
            ps.execute();
        }catch(SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void delete(Department department) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("delete from tb_department where abrev = ?");
            ps.setString(1, department.getAbbreviation());
            
            ps.execute();
        }catch(SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    
}
