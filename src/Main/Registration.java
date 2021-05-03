package Main;

public class Registration {

    static public RegistrationResult registrateUser(UserDTO userDto){
        RegistrationResult result = new RegistrationResult();
        if(userDto.getName().isEmpty() || userDto.getVorname().isEmpty() || userDto.getEmail().isEmpty() || userDto.getPassword().isEmpty() ){
            result.setResult("a mandatory field is empty");
            return result;
        }
        if(!userDto.getEmail().contains("@")){
            result.setResult("Email address must contain @");
            return result;
        }
        if(!userDto.getPhoneNumber().isEmpty() && !userDto.getPhoneNumber().startsWith("+49")) {
            result.setResult("The phone number must start with german prefix (+49)");
            return result;
        }
        if(!userDto.getPassword().matches(".*[0-9].*") || !userDto.getPassword().matches(".*[A-Z].*") || !userDto.getPassword().matches(".*[a-z].*") ) {
            result.setResult("the password you chose is not secure (weak)");
            return result;
        }
        result.setResult("Main.Registration successful");
        return result;



    }
}
