package inheritance.upCastingAndDownCasting;
/*
Class is blueprint for objects, for a single we can create n of objects.
 */
public class Machine {
    public void startup(){
        System.out.println(this.getClass().getName() + " Machine is starting up.");
    }

    public void shutDown(){
        System.out.println(this.getClass().getName() + " Machine is shutting down.");
    }
}
