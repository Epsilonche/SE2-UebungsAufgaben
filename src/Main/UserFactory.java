package Main;

public class UserFactory {

    public UserFactory(){ }

    public UserDTO createEmptyUser(){
        return new UserDTO("","","","","");
    }
    public UserDTO createUserWeakPassowrd(){
        return new UserDTO("Othman","Moukhli","othman@gmail.com","123456","+49886787");
    }
    public UserDTO createUserWrongEmail(){
        return new UserDTO("Othman","Moukhli","othmangmail.com","Aujq!37jA?WQkj13$","+49886787");
    }
    public UserDTO createUserWrongPhone(){
        return new UserDTO("Othman","Moukhli","othman@gmail.com","Aujq!37jA?WQkj13$","9886787");
    }
    public UserDTO createCorrectUser(){
        return new UserDTO("Othman","Moukhli","othman@gmail.com","Otgh123kx","");
    }

}
