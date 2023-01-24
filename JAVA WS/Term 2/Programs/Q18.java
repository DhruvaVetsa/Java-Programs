import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows;
        System.out.print("Enter the number of rows for the pyramid : ");
        rows = in.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i - 1; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }       
    }
}