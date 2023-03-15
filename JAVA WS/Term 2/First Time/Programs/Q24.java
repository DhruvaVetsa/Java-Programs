import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isContinued = true;
        int balance = 10000;
        do {
            System.out.println("Exit (0)");
            System.out.println("Check Balance (1)");
            System.out.println("Withdraw Money (2)");
            System.out.println("Deposit Money (3)");
            System.out.print("\n\nEnter the Action Code : ");
            int response = in.nextInt();
            switch (response) {
                case 0 :
                    System.out.println("\n\nTHANK YOU! VISIT AGAIN!");
                    System.out.println("\n=========================================");
                    System.out.println("=================THE END=================");
                    System.out.println("=========================================");
                    return;
                case 1: 
                    System.out.println("Your Bank Balance is : " + balance);
                    break;
                case 2: 
                    System.out.print("Enter the amount of money to be withdrawed in Rs : Rs. ");
                    int amtWithdrawed = in.nextInt();
                    if (amtWithdrawed >= balance) {
                        System.out.println("You dont have sufficient money. Withdrawing only " + balance + " rupees");
                        balance = 0;
                    }
                    else {
                        balance -= amtWithdrawed;
                    }
                    break;
                case 3: 
                    System.out.print("Enter the amount of money to be deposited in Rs : Rs. ");
                    int amtDeposited = in.nextInt();
                    balance += amtDeposited;
                    break;
                default :
                    System.out.println("Enter a valid Input");
                    break;
            }
            System.out.println("\n=========================================\n");
        }
        while (isContinued);
    }
}