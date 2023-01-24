import java.util.Scanner;

public class Q19 {
    public static final double pi = 3.14d;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius & height of the Cylinder : ");
        int r = in.nextInt();
        int h = in.nextInt();
        double area = 2 * pi * r * (r + h);
        System.out.print("The T.S.A of the Cylinder is " + area + "unit²");        
    }
}