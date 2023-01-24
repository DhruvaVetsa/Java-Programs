import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        float ans = ((a * b) + (a - b)) / 2;
        System.out.print("((" + a + " * " + b + ") + (" + a + " - " + b + ")) / 2 = " + ans);
    }
}