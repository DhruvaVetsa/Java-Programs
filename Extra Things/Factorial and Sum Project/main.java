import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        long i = 1;
        do {
            boolean iscontinued = checkResult1();
            if (iscontinued) {
                boolean action = checkResult2();
                long number = checknum();
                long result;
                String act;
                if (action) {
                    result = sumOfNNos(number);
                    act = "Sum of numbers from 1 to ";
                }
                else {
                    result = factorialOfNNos(number);
                    act = "Factorial of ";
                }
                System.out.println("The " + act + number + " is " + result);
            }
            else {
                i = 0;
            }
        } while (i >= 1);
    }

    public static long checknum() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Please enter a positive number : ");
        long number = scannerObj.nextInt();
        if (number < 0) {
            return checknum();
        } else {
            return number;
        }
    }

    public static long factorialOfNNos(long num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorialOfNNos(num - 1);
        }
        
    }

    public static long sumOfNNos(long num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumOfNNos(num - 1);
        }
    }

    public static boolean checkResult1() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Please enter 'C' to continue and 'E' to end the process : ");
        String res1 = objScanner.nextLine();
        if (res1.equalsIgnoreCase("C")) {
            return true;
        }
        else if (res1.equalsIgnoreCase("E")) {
            return false;
        }       
        else {
            return checkResult1();
        }
    }

    public static boolean checkResult2() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Please enter 'F' to find the factorial of a number and 'A' to find the sum of n numbers : ");
        String res2 = objScanner.nextLine();
        if (res2.equalsIgnoreCase("A")) {
            return true;
        }
        else if (res2.equalsIgnoreCase("F")) {
            return false;
        }       
        else {
            return checkResult2();
        }
    }
}
