import java.util.ArrayList;
import java.util.List;
public class ListExampleInJava5 {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        guestList.add("Nikhil");
        guestList.add("Sahil");
        guestList.add("Karan");
        guestList.add("Ashish");
//        guestList.add(100);
//        guestList.add(10.5);

        for (String name: guestList) {
            System.out.println("My guest : " + name);
        }

        List<Integer> primeNum = new ArrayList<>();
        primeNum.add(2);
        primeNum.add(3);
        primeNum.add(5);

        for (int i : primeNum) {
            System.out.println("Prime num i : "+ i);
        }
//        primeNum.add("Nikhil");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nikhil", 23, 100));
        studentList.add(new Student("Sahil", 25, 101));
        studentList.add(new Student("Karan", 21, 102));
        studentList.add(new Student("Ashish", 23, 103));

        for (Student student : studentList) {
            System.out.println("my student name : "  + student);
        }

        Employee<HR>/*here HR is Actual Data type */ hrEmployee = new HR();
        Employee<Admin> adminEmployee = new Admin();
        Employee<Developer> developerEmployee = new Developer();
    }
}