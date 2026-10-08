package main.java.com.inversionesmagdezis.inversiones.magdezis.dto.response;


public class LoginDTOResponse {
    private String name;
    private String lastName;
    private String passwordHash;
    private String rolName;

    public LoginDTOResponse(String name, String lastName, String passwordHash, String rolName) {
        this.name = name;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rolName = rolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }
    
    
}
