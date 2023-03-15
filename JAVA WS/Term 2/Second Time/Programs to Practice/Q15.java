import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range for tables : ");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print( i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}