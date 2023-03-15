import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a;
        a = in.nextInt();
        int i;
        
        System.out.println("WHILE LOOP : ");
        i = 1;
        while (i <= 20) {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
            i++;
        }
        System.out.println();
        
        System.out.println("DO WHILE LOOP : ");
        i = 1;
        do {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
            i++;
        } while (i <= 20);
        System.out.println();
        
        System.out.println("FOR LOOP : ");
        for (i = 1; i <= 20; i++) {
            System.out.println("\t" + a + " x " + i + " = " + (a * i));
        }
    }
}