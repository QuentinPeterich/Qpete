enum Majors {MATH, CS, IT, OTHER};

//User = base class, parent class, super class
//Student = derived class, child class
public class Student extends User {
    //inherits username, password, ...
    private Majors major;
    private String email;
    private String firstName;
    private String lastName;
    private double GPA;

    public void Display() {
        System.out.println("Major: " + major);
        System.out.println("Email: " + email);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("GPA: " + GPA);
        //System.out.println("Username: "+userName);
        //System.out.println("Password: "+password);
        super.Display();

    }
    public void FancyMethod()
    {
//        super.FancyMethod();
        System.out.println("I was called from the student class");
    }

    public String toString()
    {
        return "JBLM";
    }

    public Student(Majors major, String email, String firstName,
                   String lastName, String username, String password) {
        super(username, password);
        // this.userName = username;
        // this.password = password;

        this.major = major;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}