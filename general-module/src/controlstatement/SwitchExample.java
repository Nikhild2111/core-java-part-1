package controlstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("Please enter a string : ");
        //User input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("User has entered : "+input);

    }
}
