import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid : ");
        int rows = in.nextInt();
        System.out.print("Enter the charecter used to make the pyramid : ");
        char sym = in.next().charAt(0);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
