import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int days;
        System.out.println("1day = 24 hrs");
        System.out.print("Please enter the number of days : ");
        days = scannerObj.nextInt();
        if (days == 0) {
            days = 1;
        }
        if (days < 0) {
            days *= -1;
        }
        final int hours = 24 * days;
        System.out.println(days + "day(s) = " + hours + " hrs");
    }    
}
