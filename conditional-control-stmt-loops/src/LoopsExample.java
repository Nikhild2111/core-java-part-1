public class LoopsExample {
    public static void main(String[] args) {
        //print first 10 natural numbers
        //Loops - use for reoetitive operation
        //1. For
        //2. while
        //3. do while
        //4. advance for loop

        System.out.println("For Loop example");
        for (int i=1; i<=10; i++){
           //int i=1; ->initialization  i<=10; -> cond check  i++ -> increament

            System.out.println("i =" + i);
        }

        System.out.println("For Loop example");
        for (int i=10; i>=1; i--){
            //int i=10; ->initialization  i>=1; -> cond check  i-- ->decrement

            System.out.println("i =" + i);
        }


        System.out.println("While Loop example");
        int i=10; //initialization
        while (i>=1  /*conditiom checking*/){
            System.out.println("i = " + i);
            i--;
        }


        System.out.println("Do-While Loop example:");
        int j=10; //initialization
        do {
            System.out.println("j = " + j);
            j--;
        }while (j>=1 /*condition checking*/);


    }
}
