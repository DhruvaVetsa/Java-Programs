import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a, b;
        a = in.nextInt();
        System.out.print("Enter a number greater than " + a + " : ");
        b = in.nextInt();
        int i;
        System.out.println("WHILE LOOP : ");
        i = a;
        System.out.print("\tEven numbers : ");
        while (i <= b) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.print("\tOdd numbers : ");
        i = a;
        while (i <= b) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        System.out.println("DO WHILE LOOP : ");
        i = a;
        System.out.print("\tEven numbers : ");
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= b);
        System.out.println();
        i = a;
        System.out.print("\tOdd numbers : ");
        do {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= b);
        System.out.println();
        i = a;
        System.out.println("FOR LOOP : ");
        System.out.print("\tEven numbers : ");
        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        i = a;
        System.out.println();
        System.out.print("\tOdd numbers : ");
        for (i = a; i <= b; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}