import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 1;
        do {
            boolean isContinued = checkResult1();
            if (isContinued) {
                int num = checkNumber();
                boolean isComposite = checkPrimeComposite(num);
                if (isComposite) {
                    System.out.println(num + " is a Composite Number");
                }
                else {
                    System.out.println(num + " is a Prime Number");
                }
            } else {
                i = 0;
            }
        } while (i >= 1);
    }

    public static boolean checkResult1() {
        System.out.print("Press 'S' to start the app and press 'E' to end the app : ");
        Scanner obj = new Scanner(System.in);
        String res = obj.nextLine();
        if (res.equalsIgnoreCase("S")) {
            return true;
        } else if (res.equalsIgnoreCase("E")) {
            return false;
        } else {
            return checkResult1();
        }
    }

    public static int checkNumber() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter a positive integer : ");
        int integer = obj.nextInt();
        if (integer <= 0) {
            return checkNumber();
        }
        else {
            return integer;
        }
    }

    public static boolean checkPrimeComposite(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}