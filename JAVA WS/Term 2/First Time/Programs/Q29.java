import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print("Do you want the Greatest or Smallest. Type 'G' for Greatest and 'S' for smallest : ");
        char response = in.next().charAt(0);
        if (response == 'G' || response == 'g') {
            int gNo = greatest(a, b, c);
            System.out.println("The greatest number out of " + a + ", " + b + ", " + c + " is " +  gNo);
        }
        else if (response == 'S' || response == 's') {
            int sNo = smallest(a, b, c);
            System.out.println("The smallest number out of " + a + ", " + b + ", " + c + " is " +  sNo);
        }
        else {
            System.out.println("Enter a valid Input");
        }
    }
    
    public static int greatest(int no1, int no2, int no3) {
        if (no1 > no2 && no1 > no3) {
            return no1;
        }
        else if (no2 > no3) {
            return no2;
        }
        else {
            return no3;
        }
    }

    public static int smallest(int no1, int no2, int no3) {
        if (no1 < no2 && no1 < no3) {
            return no1;
        }
        else if (no2 < no3) {
            return no2;
        }
        else {
            return no3;
        }
    }
}