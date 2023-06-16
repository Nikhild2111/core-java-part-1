import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //Read some string or user input from console
        //Read-write - input and output

        System.out.println("Pleasa enter an input(day of week): ");//output
        Scanner scanner = new Scanner(System.in);//input

        String dayofweek = scanner.next();//input

        switch (dayofweek){
            case"Monday" :
                System.out.println("Mondays are boring.");
                break;
            case"Tuesday" :
                System.out.println("Tuesday is Better than Monday.");
                break;
            case"Wednesday" :
                System.out.println("Wednesday is Okays.");
                break;
            case"Thursday" :
                System.out.println("Thursday is day that I go to office.");
                break;
            case"Friday" :
                System.out.println("Summer Fridays are half days.");
                break;
            case"Saturday" :
                System.out.println("First day weekend.");
                break;
            case"Sunday" :
                System.out.println("Awesome day.");
                break;
            default:
                System.out.println("User has entered invalid input");
        }

    }
}
