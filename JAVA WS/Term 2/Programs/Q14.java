import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a;
        a = in.nextInt();
        int i = 10;
        System.out.println("WHILE LOOP : ");
        while (i >= 1) {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
            i--;
        }
        System.out.println();
        System.out.println("DO WHILE LOOP : ");
        i = 10;
        do {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
            i--;
        } while (i >= 1);
        System.out.println();
        System.out.println("FOR LOOP : ");
        for (i = 10; i >= 1; i--) {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
        }
    }
}