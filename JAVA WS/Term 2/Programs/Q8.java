import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a, b;
        a = in.nextInt();
        System.out.println("Enter a number greater that " + a + " : ");
        b = in.nextInt();
        int i;
        System.out.println("WHILE LOOP : ");
        i = a;
        while (i <= b) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println(" DO WHILE LOOP : ");
        i = a;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= b);
        System.out.println();
        System.out.println("FOR LOOP : ");
        for (i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}