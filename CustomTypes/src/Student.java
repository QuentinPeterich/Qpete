import java.time.LocalDate;

public class Student {
// fields - characteristics
    private String name;
    private LocalDate dateOfBirth;
    private double GPA;
    private Majors major;


    //getter/accessor
    public String getName()
    {
        return name;
    }
    //setter/mutator
    public void setName(String newName)
    {
        name = newName;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate newDate)
    {
        dateOfBirth = newDate;
    }

    public double getGPA()
    {
        return GPA;
    }
    public void setGPA(double newGPA)
    {
        if(newGPA > 0)
        {
        GPA = newGPA;
        }
    }

    public Majors getMajor()
    {
        return major;
    }
    public void setMajor(Majors newMajor) {
        major = newMajor;
    }
}
