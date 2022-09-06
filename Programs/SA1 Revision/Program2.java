import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        float milk1, milk2, qty;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the quantity of milk in kgs : ");
        milk1 = in.nextFloat();
        System.out.print("Enter the fat for " + milk1 + " kgs : ");
        qty = in.nextFloat();
        System.out.print("Enter the quantity of milk to find the fat in kgs : ");
        milk2 = in.nextFloat();
        System.out.println("The fat present in " + milk2 + " is " + (milk2 * qty / milk1));
    }
}