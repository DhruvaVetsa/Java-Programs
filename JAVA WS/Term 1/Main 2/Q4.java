import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int x, v;
        System.out.print("Please enter the speed of the body in m/s : ");
        v = scannerObj.nextInt();
        System.out.print("Please enter the distance of the body in m : ");
        x = scannerObj.nextInt();
        System.out.println("====================================================================");
        System.out.println("Speed = Distance / Time");
        System.out.println("    v = x / t");
        System.out.println("    t = x / v");
        System.out.println("      t = " + x + " / " + v);
        System.out.println("      t = " + (x / v) + " second(s)");
        System.out.println("====================================================================");
        System.out.println("Therefore, time taken by the vehicle is " + (x / v) + " second(s)"); 
        System.out.println("====================================================================");
    }    
}
