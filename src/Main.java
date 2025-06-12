// require Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define variables
        final int LEGAL_AGE = 21;
        int userAge;

        // initialize Scanner
        Scanner in = new Scanner(System.in);

        // collect the user's age
        System.out.print("Enter your age: ");

        // verify the user has entered an integer
        if (in.hasNextInt()) {
            // assign user input to userAge
            userAge = in.nextInt();
            in.nextLine();
            // print a message if the user is at least legal age, otherwise do nothing
            if (userAge >= LEGAL_AGE) {
                System.out.println("You get a wrist band!");
            }
        }
    }
}
