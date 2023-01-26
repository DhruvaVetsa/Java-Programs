import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int sum = 0;
        do {
            System.out.print("Enter a number : ");
            input = in.nextInt();
            sum += input;
        } 
        while (input > 0);
        System.out.println("The sum of all numbers you have entered except the last one ( " + input + " ) is " + sum + ".");
    }
}