import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float no1, no2;
        System.out.print("Enter the first number : ");
        no1 = in.nextFloat();
        System.out.print("Enter the second number : ");
        no2 = in.nextFloat();
        System.out.println("The Largest number = " + ((no1 == no2) ? (no2 + " & " + no2) : ((no1 > no2) ? no1 : no2)));
    }
}
