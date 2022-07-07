import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two numbers are amicable if each is equal to the sum of the factors of the other (for example, 220 and 284).");
        System.out.print("Please enter 2 Numbers : ");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        a = sum

    }
    public static int sumOfFactors(int n) {
        int sum;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
