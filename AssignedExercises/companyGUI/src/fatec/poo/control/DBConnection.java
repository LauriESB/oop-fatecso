package fatec.poo.control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ichla
 */
public class DBConnection {
    private String connectionString;
    private String driver;
    private String user;
    private String password;
    private Connection connection = null;
    
    public DBConnection(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Connection openConnection() {
        if(connection == null) {
            try{
                Class.forName(driver);
                
                connection = DriverManager.getConnection(connectionString, user, password);
                System.out.println("[Connection OK]");
            }catch(Exception e) {
                System.out.println("Fail to connect to database");
                System.out.println(e.toString() + e.getMessage());
            }
        }
        return connection;
    }
    public void closeConnection() {
        try {
            connection.close();
            System.out.println("[Connection closed]");
        }catch(Exception e) {
            System.out.println("[Fail to close connection]");
            System.out.println(e.toString() + e.getMessage());
        }
    }
}
