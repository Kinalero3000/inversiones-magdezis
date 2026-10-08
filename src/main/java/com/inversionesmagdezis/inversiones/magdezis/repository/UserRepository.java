package main.java.com.inversionesmagdezis.inversiones.magdezis.repository;
import java.sql.PreparedStatement;
import main.java.com.inversionesmagdezis.inversiones.magdezis.config.DataBaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import main.java.com.inversionesmagdezis.inversiones.magdezis.dto.request.LoginDTORequest;
import main.java.com.inversionesmagdezis.inversiones.magdezis.dto.response.LoginDTOResponse;
import main.java.com.inversionesmagdezis.inversiones.magdezis.model.User;
public class UserRepository {
    private boolean state = false;
    
    public LoginDTOResponse findUserByEmail(LoginDTORequest request){
    String sql = "Select u.names, u.last_names, u.password_hash, r.rol_name\n"+
            "from users as u\n" +
            "inner join rol as r\n" + 
            "on u.id_rol = r_id_rol\n" +
            "where email = ?";
    
    try(PreparedStatement ps = DataBaseConnection.getDBConnection().prepareStatement(sql)){
        ps.setString(1, request.getEmail());
        ResultSet rs = ps.executeQuery();
        
    }catch(SQLException e){
        System.out.println("Error al conectar con la base de datos: " + e.getMessage());
    }
    return null;
    
    };
    
    public boolean save (User user){
    String sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?)";
    
    try(PreparedStatement pstm = DataBaseConnection.getDBConnection().prepareStatement(sql)){
    
    pstm.setString(1, UUID.randomUUID().toString());
    pstm.setString(2, user.getNames());
    pstm.setString(3, user.getLastNames());
    pstm.setString(4, user.getEmail());
    pstm.setString(5, user.getPasswordHash());
    pstm.setString(6, user.getIdRol());
    
    state = true;
    }catch(SQLException e){
    
        System.out.println("Error al registrar el usuario: " + e.getMessage());
    }
    
    return state;
  
    
    
    
    
    };
    
}
