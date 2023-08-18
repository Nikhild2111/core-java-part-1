package mutable;
/*
 * mutable Class.
 * Class whose object after initialization cam be modified are called mutable classes
 * mutable means once a field is created it can be modified even after the initialization
 * that means once object can be modified at any point in the program
 * in these cases possibility of a hacker modifying a field is more
 * */

public class Driver {
    public static void main(String[] args) {
        Address address =new Address(19,"AirportRoad","Shirdi",423109);
        Employee employee =new Employee(100101,25000,"Nikhil",address);
        System.out.println(employee);
//        here we can set the fields of employee and address class so these classes are mutable
        employee.setId(4449);
        address.setCity("Shirdi");
        System.out.println("\n"+employee);
    }
}
