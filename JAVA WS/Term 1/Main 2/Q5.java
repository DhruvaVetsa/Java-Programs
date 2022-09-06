import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        
        System.out.println("        Name of the Product              Quantity         Price");
        System.out.println("              Carrot                        kg              50  ");
        System.out.println("               Beans                        kg              50  ");
        System.out.println("              Potato                        kg              50  ");
        System.out.println("              Tomato                        kg              50  ");
        System.out.println("               Onion                        kg              50  ");
        System.out.println("               Lemon                        kg              50  ");
        System.out.println("              Cabbage                       kg              50  ");
        System.out.println("            Cauliflower                     kg              50  ");
        System.out.println("             Snake Gourd                    kg              50  ");
        System.out.println("            Bitter Gourd                    kg              50  ");
        System.out.println("            Bottle Gourd                    kg              50  ");
        System.out.println("             Ridge Gourd                    kg              50  ");
        System.out.println("              Garlic                        kg              50  ");
        System.out.println("             Capcicum                       kg              50  ");
        System.out.println("              Chilli                        kg              50  ");
        System.out.println("              Mango                         kg              50  ");
        System.out.println("              Apple                         kg              50  ");
        System.out.println("              Orange                        kg              50  ");
        System.out.println("             Watermelon                     kg              50  ");
        System.out.println("              Pineapple                     kg              50  ");
        System.out.println("              Cucumber                      kg              50  ");
        System.out.println("               Pumpkin                      kg              50  ");
        System.out.println("            Curry Leaves                    set             50  ");
        System.out.println("               Coriander                    set             50  ");
        System.out.println("               Palak                        set             50  ");
        System.out.println("               Amaranthus                   set             50  ");
        System.out.println("               Muskmelon                    kg              50  ");
        System.out.println("               Bread                        pkt             50  ");
        System.out.println("               Cheese                       pkt             50  ");
        System.out.println("               Butter                       pkt             50  ");
        System.out.println("                Jam                         pkt             50  ");
        System.out.println("              Oregano                       box             50  ");
        System.out.println("             Chilli Flakes                  box             50  \n\n");

        int cost_per_unit;
        List<String> items = new ArrayList<String>();
        List<Integer> quantity = new ArrayList<Integer>();
        for (int i = 0; i < 1; i--) {
            String itemString = addItem();
            if (itemString.equalsIgnoreCase("..")) {
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
        System.out.print("Please enter how many of them you want (qty)  ");
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
        System.out.println("\t\tGOOD LIFE STORE\t\t");
        System.out.println("-----------------------------------------------------");
        int totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Product " + (i + 1) + " :-");
            System.out.println("\tName of the product : " + items.get(i));
            System.out.println("\tCost per Product : 50");
            System.out.println("\tQuantity of the product : " + qty.get(i));
            System.out.println("\tTotal Cost of the Product : " + (50 * qty.get(i)));
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
