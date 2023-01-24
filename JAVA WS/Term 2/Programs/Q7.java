import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is Candidate having LL (Learners License) or not? Enter Y or N : ");
        char hasLL = in.next().charAt(0);
        System.out.print("Enter the age of the Candidate : ");
        int age = in.nextInt();
        if (age >= 18 && (hasLL == 'Y' || hasLL == 'y')) {
            System.out.println("The candidate is eligible to get a driving license!");
        }
        else if (age < 18 && (hasLL == 'N' || hasLL == 'n') && age > 0) {
            System.out.println("The candidate is not eligible to get a driving license.");
            if (age < 18) {
                System.out.println("Wait for " + (18 - age) + " years to get a driving license");
            }
            else {
                System.out.println("Get a Learners License first!");
            }
        }
        else {
            System.out.println("Enter valid inputs");
            return;
        }
    }
}