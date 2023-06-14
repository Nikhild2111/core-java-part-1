/*
    1. Variables - store a value, and it can change in the program
    2. Constants - value of constant doesn't change in the program -> final keyword
    3. Conditional statement - if and if else
    4. Contro statements - switches
    5. Loops
*/

import java.util.Date;

public class Examples {

    public static void main(String[] args) {
        int salary; //local variable
        int age=25; //local variable
        salary = 30000; //local var
        System.out.println("salary = " + salary + " age = " + age);

        if (age > 18) {
            System.out.println("You are eligible for voting...");
        } else {
            System.out.println("You are under 18 and connot vote...");
        }

        if(salary > 50000){
            System.out.println("Your salary is more than 50k");
        } else if (salary > 40000) {
            System.out.println("Your salary is mpre than 40k");
        } else if (salary > 30000) {
            System.out.println("Your salary is greater than 30k");
        } else {
            System.out.println("Your salary is less than 30k");
        }

        salary = 40000;
        age = 30;
        System.out.println("salary = " + salary + " age = "+ age);

        final String dob = "21/11/2000"; //this "21/11/2000" is called string literal and creates string object
        //here dob is a constant and it cannot be reassigned.
        System.out.println("Date of birth : " + dob);
//        dob = "21/11/2000";


    }
}
