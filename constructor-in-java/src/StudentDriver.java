public class StudentDriver {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Nikhil",101);

        Student student3 = new Student("Sahil",102,1001,500400,'A',"COE");



        System.out.println(student1.toString());

        System.out.println(student2.toString());

        System.out.println(student3.toString());


    }
}
