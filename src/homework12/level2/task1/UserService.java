package homework12.level2.task1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> users = new HashMap<>();


    public User signUp(String login, String password) throws NoSuchAlgorithmException {
        if (users.containsKey(login)){
            return null;
        }
        while (!isPasswordValidation(password)) {
            System.out.println("Пароль не соответствует безопасности");
            return null;
        }
        String hashPass = hashingPassword(password);
        User newUser = new User(login, hashPass);
        users.put(login, hashPass);
        return newUser;
    }
    
    private boolean isPasswordValidation(String password){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialCharacter = false;
        boolean isValidation;
        String specialString = "!@#$%^&*()_+";
        for (int i = 0; i < password.length(); i++){
          char ch = password.charAt(i);
          if (Character.isUpperCase(ch)){
              upperCase = true;
          } else if (Character.isLowerCase(ch)) {
              lowerCase = true;
          } else if (Character.isDigit(ch)) {
              digit = true;
          } else if (specialString.indexOf(ch) != -1 ) {
              specialCharacter = true;
          }
        }
        isValidation = upperCase && lowerCase && digit && specialCharacter && password.length() >= 8;
        return isValidation;
    }


    private String hashingPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA256");
        byte[] hashPassword = mDigest.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hashPassword);
    }

    public boolean signIn (String login, String password) throws NoSuchAlgorithmException {
        if (!users.containsKey(login)){
            return false;
        }
        String hashedPass = users.get(login);
        String hashPassword = hashingPassword(password);
        return hashedPass.equals(hashPassword);
    }



}
