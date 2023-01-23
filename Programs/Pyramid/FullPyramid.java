import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid : ");
        int rows = in.nextInt();
        System.out.print("Enter the charecter used to make the pyramid : ");
        char sym = in.next().charAt(0);
        for (int i = 1; i <= rows; i++) {
            for (int k = rows - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
