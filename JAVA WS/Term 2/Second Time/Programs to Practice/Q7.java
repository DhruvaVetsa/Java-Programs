import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.print("Do you have a learners license? Enter Y or N only : ");
        char hasLL = in.next().charAt(0);
        if (age < 18 && age > 0) {
            System.out.println("You cant drive. Wait for " + (18 - age) + " years to drive.");
        } else if (age >= 18 && age < 140) {
            if (hasLL == 'Y') {
                System.out.println("You can drive! Make sure you are carrying yor driving licence!");
            }
            else if ( hasLL == 'N') {
                System.out.println("Get a Learners licence first!");
            }
            else {
                System.out.println("Enter valid Input!");
                return;
            }
        }
        else {
            System.out.println("Enter valid Input!");
            return;
        }
    }
}