package main.java.com.inversionesmagdezis.inversiones.magdezis.config;
public class Credentials {
    
    public static final String URL_DB = System.getenv("URL_DB");
    public static final String USER_DB = System.getenv("USER_DB");
    public static final String PASS_DB = System.getenv("PASS_DB");

    private Credentials() {
        
    }
    
    
}
