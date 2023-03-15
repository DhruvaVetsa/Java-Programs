import java.util.Scanner;

public class Q20 {
    public static final float pi = 3.14f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        float value = ((a * b) + (a - b)) / 2;
        System.out.println("The value of ((" + a + "*" + b + ") + (" + a + "-" + b + ")) / 2" + " is " + value);
    }
}