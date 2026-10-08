package main.java.com.inversionesmagdezis.inversiones.magdezis.config;
    import java.sql.Connection;
    import java.sql.SQLException;
    import java.sql.DriverManager;
public class DataBaseConnection {   
    
    private static Connection connection;
    
        private DataBaseConnection(){}
        
            
            public static Connection getDBConnection() throws SQLException{
            if (connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(Credentials.URL_DB, Credentials.USER_DB, Credentials.PASS_DB);
                
            }
            return connection;
            
        }

}
    
    

