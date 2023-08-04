public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
        // new obj of type MyArrayList
        MyArrayList numbers = new MyArrayList();


        System.out.println(numbers.isEmpty()); // true


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.getCount()); // should display 3
        System.out.println(numbers.getCapacity()); // 10 20 30
        System.out.println(numbers);
        System.out.println(numbers.isEmpty()); // false

        numbers.addFirst(60);
        numbers.addFirst(70);
        numbers.addFirst(80);
        System.out.println(numbers.getCount()); // should display 6
        System.out.println(numbers.getCapacity()); // 80 70 60 10 20 30
        System.out.println(numbers);

        numbers.clear(); // should remove all elements from the list
        System.out.println(numbers.isEmpty()); // true
    }
}
