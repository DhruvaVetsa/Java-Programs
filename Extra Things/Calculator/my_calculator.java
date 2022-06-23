import java.util.Scanner;

public class my_calculator {
    public static void main(String[] args) {
        int i = 1;
        do {
            String operation;
            char operationSymbol;
            Double a, b;
            Double res;
            boolean mainAction = checkToContinue();
            if (!mainAction) {
                i = 0;
                return;
            } else {
                operation = takeAction2();
                a = takeAction3();
                b = takeAction3();
                if (operation.equalsIgnoreCase("A")) {
                    operationSymbol = '+';
                    res = a + b;
                } else if (operation.equalsIgnoreCase("S")) {
                    operationSymbol = '-';
                    res = a - b;
                } else if (operation.equalsIgnoreCase("M")) {
                    res = a * b;
                    operationSymbol = '×';
                } else {
                    operationSymbol = '÷';
                    res = a / b;
                }
                System.out.println("The value of " + a + " " + operationSymbol + " " + b + " is " + res);
            }
        } while (i > 0);
    }

    public static Boolean checkToContinue() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Please enter E to End the calculator and S to continue/Start the calculator : ");
        String res1 = scannerObj.nextLine();
        if (res1.equalsIgnoreCase("E")) {
            return false;
        } else if (res1.equalsIgnoreCase("S")) {
            return true;
        } else {
            return checkToContinue();
        }
    }

    public static String takeAction2() {
        System.out.print(
                "Please enter 'A' to add 2 numbers, 'S' to subtract 2 numbers, 'M' to multiply 2 numbers and 'D' to divide 2 numbers : ");
        Scanner operationScanner = new Scanner(System.in);
        String oper = operationScanner.nextLine();
        if (oper.equalsIgnoreCase("A") || oper.equalsIgnoreCase("S") || oper.equalsIgnoreCase("M")
                || oper.equalsIgnoreCase("D")) {
            return oper;
        } else {
            return takeAction2();
        }
    }

    public static Double takeAction3() {
        System.out.print("Please enter a number : ");
        Scanner operationScanner = new Scanner(System.in);
        Double oper = operationScanner.nextDouble();
        return oper;
    }
}