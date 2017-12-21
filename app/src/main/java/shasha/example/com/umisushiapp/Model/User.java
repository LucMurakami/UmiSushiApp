package shasha.example.com.umisushiapp.Model;

/**
 * Created by shasha on 2017-12-20.
 */

public class User {

    private String name;
    private String password;

    public User() {

    }

    public User(String Pname, String Ppassword) {
        name = Pname;
        password = Ppassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String Pname) {
        name = Pname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Ppassword) {
        password = Ppassword;
    }
}
