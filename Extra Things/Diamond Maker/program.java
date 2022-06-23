import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.print("Please enter the number of rows of the diamond : ");
        int rows = numScan.nextInt();
        makeDiamond(rows);
    }

    public static void makeDiamond(int rows) {
        for (int c1 = 0; c1 < rows; c1++) {
            for (int c2 = rows - c1; c2 > 0; c2--) {
                System.out.print(' ');
            }
            for (int c3 = 0; c3 < c1 * 2; c3++) {
                System.out.print('|');
            }
            System.out.println(' ');
        }
        for (int c4 = 0; c4 < rows; c4++) {
            for (int c3 = 0; c3 < c4; c3++) {
                System.out.print(' ');
            }
            for (int c2 = (rows - c4) * 2; c2 > 0; c2--) {
                System.out.print('|');
            }
            System.out.println(' ');
        }
    }
}