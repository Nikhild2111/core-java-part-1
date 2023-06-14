package drivers;

import a.b.c.C;
import entities.Address;
import entities.College;
import entities.Employee;
import entities.Student;

public class Driver {
    public static void main(String[] args){

        Address address = new Address();
        address.setFlatNum("A101");
        address.setLineNum("Airport road");
        address.setTaluka("Rahata");
        address.setDistrict("Ahmednagar");
        address.setState("MH");


        College college = new College();
        college.setName("COE");
        college.setNumOfStaff(200);
        college.setNumOfStudent(2000);


        Employee employee = new Employee();
        employee.setName("Sahil");
        employee.setAge(25);
        employee.setCollegeName(college);


        Student student = new Student();
        student.setName("Nikhil");
        student.setAddress(address);
        student.setCollegeName(college);
        student.setId(101);


        System.out.println(address.toString());
        System.out.println(college.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());


        C objC = new C();
//        objC.defaultVariable=10;

        objC.publicVariable = 3000;


    }
}
