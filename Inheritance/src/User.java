public class User {
    private String userName;
    private String password;

    public void login()
    {

    }

    public void Display()
    {
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
    public void FancyMethod()
    {
        System.out.println("I was called from the user class");
    }


    public User(String newUser, String newPassword) {
        userName = newUser;
        password = newPassword;
    }
}
