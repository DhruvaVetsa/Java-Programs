import java.util.Scanner;

public class Q19 {
    public static final float pi = 3.14f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder : ");
        int r = in.nextInt();
        System.out.print("Enter the height of the cylinder : ");
        int h = in.nextInt();
        float tsa = 2 * pi * r * (r + h);
        System.out.println("The Totall Surface area of the cylinder is " + tsa + " unit²"); 
    }
}