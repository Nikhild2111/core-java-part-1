public class Employee {

    //attributes or fields
    String name;
    int id;
    String address;
    long phoneNo;
    long salary;
    String gender;
    String company;

    //Constructors the object , basically initializes objects.
    /*
    1. Constructors Name must same as class Name
    2. Constructors Does not have any return type
    3. Constructors can have parameters
    4. Constructors doesn't return any value
     */

    //no arguments constructors
    Employee(){
        System.out.println("***********************************");
        System.out.println("no arg constructor called");
        this.name = "Nikhil";
        this.id = 101;
        this.salary = 10000;
        this.gender = "male";
        this.company = "TCS";
        this.address = "Shirdi";
        this.phoneNo = 8767323773L;
        System.out.println("***********************************");
    }

    Employee(String name, int id, int salary){
        //calling a constructor with gender and company as params
        this("Male","Accenture");
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee(String gender, String company){
        this("Pune", 1011012020);
        this.gender = gender;
        this.company = company;
    }

    Employee(String address, long phoneNo){
        this.address = address;
        this.phoneNo = phoneNo;
    }

    //parameterised constructors
    Employee(String name,int id, int salary, String gender, String company, String address, long phoneNo){
        System.out.println("***********************************");
        System.out.println("parameterized constructor called");
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this.phoneNo = phoneNo;
        System.out.println("***********************************");
    }

    //copy constructor - copy fields from one object to another object

    Employee(Employee employee){
            // this here will refer employee6 as this constructor is called by employee6
        this.name = employee.name;
        this.address = employee.address;
        this.gender = employee.gender;
        this.salary = employee.salary;
        this.id = employee.id;
        this.phoneNo = employee.phoneNo;
        this.company = employee.company;
    }
    void displayObjectAndMessage(){
        System.out.println( "Hello" + this.name);
        System.out.println(this.id + "\n" + this.salary + "\n" + this.gender + "\n" +this.company + "\n" + this.address + "\n" + this.phoneNo);

    }
}

