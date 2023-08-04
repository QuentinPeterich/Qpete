enum Departments{
    ENGINEERING,
    MATH,
    ADMIN,
    SCIENCE,
    TECHNOLOGY}

public class Instructor extends User implements Comparable<Instructor>{
    public Departments department;


    public Instructor(String userName, String password, Departments department){
        super(userName, password);
        // super calls the constructor from the base class
        this.department = department;
//        this.userName = userName;
//        this.password = password;
        // username and password are private within user class
    }

    // methods
    // overriding toString and getting it from the base from user
    public String toString(){
        return "Instructor\n" + super.toString() + "\nDepartment: " + department;
    }

    public String toString(int number){
        return "Instructor: ";
    }


    public void DoNothingMethod()
    {

    }

    // compare left to right
    // -1 if left < right
    // 0 if left == right
    // 1 if left > right
    public int compareTo(Instructor o) {
        Instructor left = this;
        Instructor right = o;
        return left.userName.compareTo(right.userName);
    }
}
