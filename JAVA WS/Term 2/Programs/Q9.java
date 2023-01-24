import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.nextLine();
        int i = 1;
        System.out.println("WHILE LOOP : ");
        while (i <= 20) {
            System.out.print(name + " ");
            i++;
        }
        System.out.println();
        System.out.println(" DO WHILE LOOP : ");
        i = 1;
        do {
            System.out.print(name + " ");
            i++;
        } while (i <= 20);
        System.out.println();
        System.out.println("FOR LOOP : ");
        for (i = 1; i <= 20; i++) {
            System.out.print(name + " ");
        }
    }
}