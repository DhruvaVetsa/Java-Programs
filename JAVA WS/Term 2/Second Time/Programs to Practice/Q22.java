import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 30 and 50 : ");
        int num = in.nextInt();
        for (int i = 30; i <= 50; i++) {
            if (i == num) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}