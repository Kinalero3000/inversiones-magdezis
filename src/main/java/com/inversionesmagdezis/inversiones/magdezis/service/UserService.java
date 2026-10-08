package main.java.com.inversionesmagdezis.inversiones.magdezis.service;

import main.java.com.inversionesmagdezis.inversiones.magdezis.dto.request.LoginDTORequest;
import main.java.com.inversionesmagdezis.inversiones.magdezis.dto.response.LoginDTOResponse;
import main.java.com.inversionesmagdezis.inversiones.magdezis.repository.UserRepository;
import main.java.com.inversionesmagdezis.inversiones.magdezis.security.jbcrypt.BCrypt;
import main.java.com.inversionesmagdezis.inversiones.magdezis.model.User;
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public LoginDTOResponse login(LoginDTORequest request){
        if(request == null){
        throw new RuntimeException("Los datos están vacios");
        }else if(request.getEmail() == null || request.getPasswordHash() == null){
        throw new RuntimeException("Uno o más campos están vacío");
        }else if(request.getEmail().isEmpty() || request.getPasswordHash().isEmpty()){
        throw new RuntimeException("No puedes dejar los campos vacíos");
        };
        LoginDTOResponse response = userRepository.findUserByEmail(request);
        
        if(response == null){
            System.out.println("No se ha encontrado el usuario en la DB");
        }
        
        if(response.getPasswordHash() == null){
        throw new RuntimeException("No se pudo completar la operacion");
        
        }else{
        if(BCrypt.checkpw(request.getPasswordHash(), response.getPasswordHash())){
        return response;
        }
        }
        
        return null;

    }
    
    public boolean newUser((User user)){}
        boolean register;
     String passwordHash = BCrypt.hashpw(user.getPasswordHash, salt)
    
    
    
    
    } 
    

