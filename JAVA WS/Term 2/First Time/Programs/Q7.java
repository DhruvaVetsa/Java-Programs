import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is Candidate having LL (Learners License) or not? Enter Y or N : ");
        char hasLL = in.next().charAt(0);
        System.out.print("Enter the age of the Candidate : ");
        int age = in.nextInt();
        if (hasLL == 'Y' || hasLL == 'y') {
            if (age >= 18) {
                System.out.println("The candidate is eligible to get a driving license!");
            } else if (age > 0) {
                System.out.println("The candidate is not eligible to get a driving license.");
                System.out.println("Wait for " + (18 - age) + " years to get a driving license");

            } else {
                System.out.println("Enter valid inputs");
            }
        } else if (hasLL == 'N' || hasLL == 'n') {
            System.out.println("Get a Learners License first!");
        } else {
            System.out.println("Enter valid inputs");
        }
    }
}