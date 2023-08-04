public class Instructor extends User{

    private String department;
    private String firstName;
    private String lastName;



    public Instructor(String userName, String password,
                      String department, String firstName, String lastName)
    {
        super(userName, password);
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
