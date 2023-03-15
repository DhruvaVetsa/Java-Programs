import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        int i = 1;
        
        System.out.println("WHILE LOOP : ");
        System.out.print("\t");
        while (i <= 20) {
            System.out.print(name + " ");
            i++;
        }
        System.out.println();

        System.out.println("DO WHILE LOOP : ");
        System.out.print("\t");
        i = 1;
        do {
            System.out.print(name + " ");
            i++;
        } while (i <= 20);
        System.out.println();

        System.out.println("FOR LOOP : ");
        System.out.print("\t");
        for (i = 1; i <= 20; i++) {
            System.out.print(name + " ");
        }
    }
}