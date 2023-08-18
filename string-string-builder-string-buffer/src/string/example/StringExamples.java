package string.example;
//String is non-primitive data type and creates new string objects which immutable.

/*
There are two ways to create String objects.
1. Using new keyword. -> It creates two object. One in heap and one in string constant pool
if string constant pool doesn't contain same string object.
        String name = new String("Nikhil");


2. Using string literal.
        String name2 = "Nikhil";//"Nikhil" is string literal
 */

/*
String constant pool - It is part of heap memory that is created by String class when
this String class is loaded by the classloader, then a part heap memory is reserved for
string constants and stored into it.
 */
public class StringExamples {
    public static void main(String[] args) {

        String name = new String("Nikhil");//this creates new object in SCP and heap both.
        System.out.println(name);

        String name2 = "Nikhil";//this creates new object in SCP.
        System.out.println(name2);

        name = name.concat("Dabhade");///this creates new object in SCP and heap both.
        System.out.println(name);

        String sahil = new String("Sahil");
        //moin variable
        //"Moin" two string objects are created, one in heap and other SCP
        //moin variable points object in heap

        sahil = sahil.concat("Dabhade");
        //a new String object will be created, Heap and SCP, "SahilDabhade" and
        //sahil will point to this new string object in the heap

        String sahil2 = "SahilDabhade";//sahil2 points to SCP object
        System.out.println("sahil == sahil2 : " + (sahil == sahil2));

        String sahil4 = "Sahil";

//        String sahil3 = sahil4 + "Dabhade";//sahil3 points to SCP object
        String sahil3 = "Sahil" + "Dabhade";//sahil3 points to SCP object
        System.out.println("sahil2 == sahil3 : " + (sahil2 == sahil3));
    }
}
