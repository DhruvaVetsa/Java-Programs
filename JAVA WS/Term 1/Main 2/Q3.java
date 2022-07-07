import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int x, y;
        System.out.print("Please enter 2 numbers : ");
        x = scannerObj.nextInt();
        y = scannerObj.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("====================================================================");
        System.out.println("x square is " + (x * x));
        System.out.println("x cube is " + (x * x * x));
        System.out.println("y square is " + (y * y));
        System.out.println("y cube is " + (y * y * y));
        System.out.println("====================================================================");
    }    
}
