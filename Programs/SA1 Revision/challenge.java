import java.util.Scanner;

public class challenge {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number_to_be_guessed = 49;
        int tries_max = 5;
        int no_entered = 0;
        int tries_done = 0;
        while (no_entered != number_to_be_guessed || tries_done >= tries_max) {
            System.out.println("Type a number between 1 to 100");
            no_entered = in.nextInt();
            if (tries_done == tries_max) {
                System.out.println("The answer was " + number_to_be_guessed + " better luck next time");
                return;
            } else if (number_to_be_guessed == no_entered) {
                System.out.println("CORRECT ANSWER!!!!");
                return;
            }

            if (no_entered > number_to_be_guessed) {
                System.out.println("too high");
            } else if (no_entered < number_to_be_guessed) {
                System.out.println("too low");
            } 
            ++tries_done;
        }
    }
}
