package polymorphism;
/*
    Many form of same item/things
    Single method can have many forms.  ->Poly mosphism
    1. Static or compile time or overloading
       a - No of parameter can be different
       b - Seq of parameter can be different
       c - Type of parameter can be different
    2. Dynamic or runtime or overriding
 */
public class MethodOverloadingExample {

    void displayMsg(){
        System.out.println("A method with no argument called.");
    }

    void displayMsg(String msg){
        System.out.println("A method with one param called with msg "+ msg);
    }

    void displayMsg(int num){
        System.out.println("A method with one param called with num"+ num);
    }

    void displayMsg(int num, String msg){
        System.out.println("A method with one param called with num"+ num + " msg "+ msg);
    }

    void displayMsg(String msg, int num){
        System.out.println("A method with one param called with msg"+ msg + " num "+ num);
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.displayMsg();
    }

}
