import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows;
        char sym;
        System.out.print("Enter the number of rows for the pyramid : ");
        rows = in.nextInt();
        System.out.print("Enter the symbol used to make the pyramid : ");
        sym = in.next().charAt(0); 
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i - 1; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(sym + " ");
            }
            System.out.println();
        }       
    }
}