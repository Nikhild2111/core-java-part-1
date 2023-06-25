package polymorphism;

public class Dog extends Animal{
    @Override
    void walk() {
        super.walk();
        System.out.println("Dog is walking");
    }

    @Override
    void run(String msg) {
        super.run(msg);
        System.out.println("Dog is running");
    }
}
