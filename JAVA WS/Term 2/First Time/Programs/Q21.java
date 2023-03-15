import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 3 numbers from 1 to 10 : ");
        a = in.nextInt();   
        b = in.nextInt();   
        c = in.nextInt();   
        if ((a <= 10 && a >= 1) && (b <= 10 && b >= 1) && (c <= 10 && c >= 1)) {
            for (int i = 1; i <= 10; i++) {
                if (i == a || i == b || i == c) {
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