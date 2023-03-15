import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 number from 30 to 50 : ");
        int a = in.nextInt();
        if (a <= 50 && a >= 30) {
            for (int i = 30; i <= 50; i++) {
                if (i == a) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
        else {
            System.out.print("Enter a valid Input!");
            return;  
        }
    }
}