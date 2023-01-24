import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a;
        a = in.nextInt();
        int i;
        System.out.println("WHILE LOOP : ");
        i = a;
        while (i <= 20) {
            System.out.println(a + " x " + i + " = " + (a * i));
            i++;
        }
        System.out.println();
        System.out.println(" DO WHILE LOOP : ");
        i = a;
        do {
            System.out.println(a + " x " + i + " = " + (a * i));
            i++;
        } while (i <= 20);
        System.out.println();
        System.out.println("FOR LOOP : ");
        for (i = a; i <= 20; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}