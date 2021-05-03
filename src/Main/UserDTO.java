package Main;

public class UserDTO {

    private String vorname; // mendatory
    private String name; // mendatory
    private String email; // mendatory contains @
    private String password; // mendatory
    private String phoneNumber;

    public UserDTO(String vorname,String name,String email,String password,String phoneNumber){
        this.vorname=vorname;
        this.name=name;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getVorname() {
        return vorname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
