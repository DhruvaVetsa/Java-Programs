import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> numbersGiven = new ArrayList<Integer>();
    public static List<Integer> sortedList = new ArrayList<Integer>();

    public static void main(String[] args) {
        addNumber();
        sortedList = numbersGiven;
        String sortedList = sort();
        System.out.println("The sorted List is :" + sortedList);
        System.out.println("===============================================================");
    }

    public static void addNumber() {
        System.out.print("Please enter any integer : ");
        Scanner scannerOBJ = new Scanner(System.in);
        numbersGiven.add(scannerOBJ.nextInt());
        if (numbersGiven.size() >= 2) {
            if (!takeInput1()) {
                addNumber();
            }
            else {
                System.out.println("===============================================================");
            }
        }
        else {
            addNumber();
        }
    }

    public static Boolean takeInput1() {
        System.out.print("Do you want to add any other number to be sorted? If yes, please type 'Y' else type anything else : ");
        Scanner scannerOBJ = new Scanner(System.in);
        String userInput = scannerOBJ.nextLine();
        if (userInput.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public static String sort() {
        List<Boolean> pos_neg = new ArrayList<Boolean>();
        for (int i = 0; i < numbersGiven.size() - 1; i++) {
            int v1 = numbersGiven.get(i), v2 = numbersGiven.get(i + 1);
            if ((v1 - v2) <= 0) {
                pos_neg.add(false);
            } else {
                int prevv1 = v1, prevv2 = v2;
                sortedList.set(i, prevv2);
                sortedList.set((i + 1), prevv1);
                pos_neg.add(true);
            }
        }
        for (Boolean boolVal : pos_neg) {
            if (boolVal) {
                return sort();
            }
        }
        String result = sortedList.toString();
        result = result.replace('[', ' ');
        result = result.replace(']', ' ');
        // for (Integer myInteger : sortedList) {
        //     result += myInteger;
        //     result += ", ";
        // }
        return result;
    }
}