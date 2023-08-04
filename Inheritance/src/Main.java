public class Main {

    public static void TestMe(User u)
    {
        System.out.println("Testing the waters");
        u.FancyMethod();
        System.out.println("Testing finished");
    }

    public static void main(String[] args) {
        //A objA = new A();
        //objA.privateFieldA = 10;

        B objB = new B();
        objB.protectedFieldA = 10;

        User u = new User("Alex", "Password1234");
        //System.out.println(u.userName);
        System.out.println("=======================");
        u.Display();
        System.out.println("=======================");


        Student s = new Student(Majors.CS, "alex@stmartin.edu","Alex",
                "Mezei", "alexmezei",  "Password124" );
        System.out.println("=======================");
        s.Display();
        System.out.println("=======================");

//        Student s2 = s;
        System.out.println(s.toString());

        s.FancyMethod(); // inheritance and later method overriding


        System.out.println("================================");
        System.out.println("================================");
        // polymorphism
        User u11 = new User(null, null);
        User u22 = new Student(null, null, null, null, null,null);
        Student s33 = new Student(null, null, null, null, null,null);
        u11.FancyMethod();
        u22.FancyMethod();
        s33.FancyMethod();
        System.out.println("================================");


//        User u33 = new Instructor();

//        Student s11 = new User();
//        Student s22 = new Instructor();


        TestMe(u11);
        TestMe(s);


    }
}