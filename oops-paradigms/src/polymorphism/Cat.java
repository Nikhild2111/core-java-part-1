package polymorphism;

/*
 Method overriding means having another method is child class with same signature
 Method overriding means providing different method definition.
 What is some signature -
    - The number of parameters must be same
    - The sequence of parameters must be same
    - The type of parameters must be same

    Note - The return type can be same as parent method or subtype of parent method.
    Note - The access level should be same or higher.
    Note - For method overriding inheritance is must.
 */
public class Cat extends Animal{
    @Override
    void walk() {
        super.walk();
        System.out.println("Cat is walking");
    }

    @Override
    void run(String msg) {
        super.run(msg);
        System.out.println("Cat is running");
    }
}
