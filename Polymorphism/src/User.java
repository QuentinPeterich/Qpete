public class User {
    public String userName;
    public String password;
    // instance variables because every user will require a username and password


    public User(String u, String p){
        userName = u;
        password = p;
    }

    @Override
    public String toString() {
        return "User: " + userName + " \nPassword: " + password;
    }
}
