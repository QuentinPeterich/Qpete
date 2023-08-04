import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void M(FancyInterface o)
    {
        o.FancyMethod();
        o.FancyMethod2();
    }


    public static void main(String[] args) {
        // this builds a new object // quentin is a reference
        User quentinUser = new User("admin", "password");
//        System.out.println(quentinUser);
        Instructor i = new Instructor("Instructor01",
                "Pa$$W0rd!",
                Departments.ADMIN);
        System.out.println(i);
        i.toString(2023);
        Car c = new Car();
        M(c);


        ArrayList<Instructor> CSDept = new ArrayList<Instructor>();
        CSDept.add(new Instructor("alex", "pass6", Departments.SCIENCE));
        CSDept.add(new Instructor("lane", "pass5", Departments.MATH));
        CSDept.add(new Instructor("tiger", "pass4", Departments.TECHNOLOGY));
        CSDept.add(new Instructor("melissa", "pass1", Departments.MATH));
        CSDept.add(new Instructor("kobe", "pass10", Departments.MATH));
        Collections.sort(CSDept);
        System.out.println(CSDept);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(15);
        numbers.add(7);
        numbers.add(23);
        int[] numbers2 = {10,40,70,80,4};

        Collections.sort(numbers);

        System.out.println(numbers);




    }
}
