import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a, b;
        a = in.nextInt();
        System.out.print("Enter a number greater than " + a + " : ");
        b = in.nextInt();
        int i;

        System.out.println("WHILE LOOP : ");
        System.out.print("\t");
        i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        System.out.println("DO WHILE LOOP : ");
        System.out.print("\t");
        i = a;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= b);
        System.out.println();

        System.out.println("FOR LOOP : ");
        System.out.print("\t");
        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}