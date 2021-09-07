import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private String age;
    private String postalCode;

    public User(String username, String password, String age, String postalCode) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.postalCode = postalCode;
    }

    public User(String age, String postalCode) {
        this.age = age;
        this.postalCode = postalCode;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
