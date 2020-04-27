package packdbconnect;
/**
 * @author Elvis Thomas Vlcek
 * Msc Computer Science with Data Analytics
 * Computer and Mobile Networks
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {
    
    private final String userName = "root";
    private final String password = "";
    private final String serverName = "localhost";
    private final int portNumber = 3306; 	 /* default port 3306)*/
    private final String dbName = "test";
    private final String tableName = "tablecustomers"; 
   
    private Connection conn;
    private static DBConnect dbc;
    /**
     * Get a new database connection
     */
    private DBConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Properties connectionProps = new Properties();
            connectionProps.put("user", this.userName);
            connectionProps.put("password", this.password);            
            conn = DriverManager.getConnection("jdbc:mysql://"
                            + this.serverName + ":" + this.portNumber + "/" + this.dbName,
                            connectionProps);  
            System.out.println("Connection Established");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static DBConnect getDBConnection(){
        if(dbc==null){
            dbc = new DBConnect();
        }
        return dbc;
    }
    
    public Connection getConnection(){
        return conn;
    }
}
