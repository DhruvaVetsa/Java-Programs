import java.util.Scanner;

public class Q1 {
    public static final double pi = 3.14d;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Choose any of the below options :- ");
            System.out.println("\t1. Area of Rectangle");
            System.out.println("\t2. Area of Square");
            System.out.println("\t3. Area of Circle");
            System.out.println("\t4. Exit");
            System.out.print("\nEnter the option code (1, 2, 3, 4) : ");
            int optionCode = in.nextInt();
            switch (optionCode) {
                case 1:
                    System.out.print("Enter the length of the rectangle : ");
                    double l, b;
                    l = in.nextDouble();
                    System.out.print("Enter the breadth of the rectangle : ");
                    b = in.nextDouble();
                    System.out.println("The area of the rectangle is " + (l * b) + " unit²");
                    break;
                case 2:
                    System.out.print("Enter the side of the square : ");
                    double s = in.nextDouble();
                    System.out.println("The area of the square is " + (s * s) + " unit²");
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle : ");
                    double r = in.nextDouble();
                    System.out.println("The area of the circle is " + (pi * r * r) + " unit²");
                    break;

                case 4:
                    System.out.println("ENDING PROGRAM!");
                    return;

                default:
                    System.out.println("Enter valid Code! \n==========ERROR==========");
                    continue;
            }
            System.out.println("\n\n\n - Starting New cycle - \n\n\n");
        } while (true);
    }
}