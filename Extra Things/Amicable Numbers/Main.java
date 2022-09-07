import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two numbers are amicable if each is equal to the sum of the factors of the other (for example, 220 and 284).");
        System.out.print("Please enter 2 Numbers : ");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        if(isAmicable(a, b)) {
            System.out.println("The numbers " + a + " " + b + " are amicable numbers!");
        }
 
    }
    public static boolean isAmicable(int no1, int no2) {
        int sum_no1 = 0;
        for (int i = 1; i <= no1; i++) {
            if (no1 % i == 0) {
                sum_no1 += i;
            }
        }
        int sum_no2 = 0;
        for (int i = 1; i <= no1; i++) {
            if (no1 % i == 0) {
                sum_no1 += i;
            }
        }
        if (sum_no1 == sum_no2) {
            return true;
        }
        else {
            return false;
        }
    }
}
