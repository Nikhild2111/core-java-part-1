public class Driver {
    public static void main(String[] args) {


        Student student1 = new Student("Nikhil", 100, 28);

        Student student2 = new Student("Nikhil",100, 28);

        Student student3 = new Student("Nikhil",100, 27);

        Student student4 = student1;

        Employee employee = new Employee("Nikhil",100, 27);




        System.out.println(student1.equals(student2));//true

        System.out.println(student1.equals(student3));//false

        System.out.println(student1.equals(employee));//false

        System.out.println(student1.equals(student4));

        System.out.println("HashCode for student1 is : "+ student1.hashCode());
        System.out.println("Nikhil hascode is : "+"N".hashCode());
        System.out.println("Nikhil hascode is : "+"Ni".hashCode());
        System.out.println("Nikhil hascode is : "+"Nik".hashCode());

    }
}
