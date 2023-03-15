import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        boolean isContinue = true;
        do {
            System.out.print("Enter a number : ");
            int number = in.nextInt();
            if (number < 0) {
                System.out.println("The sum of all positive numbers entered is " + sum);
                isContinue = false;
            }
            else {
                sum += number;
            }
        } while (isContinue);
    }
}
