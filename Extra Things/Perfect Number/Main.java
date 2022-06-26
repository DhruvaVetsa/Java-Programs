import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors.");
        int i = 1;
        do {
            int number = checkNumber();
            if (isPerfectNumber(number)) {
                System.out.println(number + " is a perfect number");
            }
            else {
                System.out.println(number + " is not perfect number");
            }
        } while (i >= 1);
    }
    public static int checkNumber() {
        System.out.print("Please enter a positive number : ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        if (number <= 0) {
            return checkNumber();
        }
        else {
            return number;
        }
    }

    public static boolean isPerfectNumber(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i <=  number; i++) {
            if (number % i == 0) {
                factors.add(i);
                sum += i;
            }
        }
        if (number == sum / 2) {
            return true;
        }
        else {
            return false;
        }
    }
}