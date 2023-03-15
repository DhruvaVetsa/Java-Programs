import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range of multiplication tables : ");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println("Multiplication Tables for " + i + " : ");
            for (int j = 1; j <= 10; j++) {
                System.out.println("\t" + i + " x " + j + " = " + (i * j));
            }
        }
    }
}