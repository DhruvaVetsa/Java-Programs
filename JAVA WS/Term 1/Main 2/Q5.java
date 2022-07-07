import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int cost_per_unit;
        List<String> items = new ArrayList<String>();
        List<Integer> quantity = new ArrayList<Integer>();
        for (int i = 0; i < 1; i--) {
            String itemString = addItem();
            if (itemString == "..") {
                calculate_and_print_bill(items, quantity);
                return;
            }
            else {
                items.add(itemString);
                quantity.add(takeQty(itemString));
            }
        }
    } 
    public static String addItem() {
        System.out.print("Please enter what product you want to buy. If you want to calculate your bill, type '..' ");
        Scanner scannerObj = new Scanner(System.in);
        return scannerObj.nextLine();        
    }
    public static int takeQty(String itemName) {
        System.out.print("Please enter how many ");
        Scanner scannerObj = new Scanner(System.in);
        int qty = scannerObj.nextInt();
        if (qty > 0) {
            return qty;
        }
        else {
            return takeQty(itemName);
        }       
    } 
    public static void calculate_and_print_bill(List<String> items, List<Integer> qty) {
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\tGOOD LIFE BAKERY\t\t");
        System.out.println("-----------------------------------------------------");
        int totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Product " + (i + 1) + " :-");
            System.out.println("\tName of the product : " + items.get(i));
            System.out.println("\tCost per Product : 250");
            System.out.println("\tQuantity of the product : " + qty.get(i));
            System.out.println("\tTotal Cost of the Product : " + (250 * qty.get(i)));
            totalCost += 250 * qty.get(i);
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("Total Cost : " + totalCost);
        System.out.println("Taxes : ");
        System.out.println("\tCGST : 15%");
        System.out.println("\tSGST : 10%");
        System.out.println("Grand total = Rs. " + (1.265 * totalCost));
        System.out.println("-----------------------------------------------------");
        System.out.println("THANK YOU! VISIT AGAIN!");
        System.out.println("-----------------------------------------------------");
    }
}
