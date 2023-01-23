import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks of English, Maths, Science, SST and Hindi as whole numbers in percentages : \n");
        int eng = in.nextInt();
        int math = in.nextInt();
        int sci = in.nextInt();
        int sst = in.nextInt();
        int hin = in.nextInt();
        int avg = eng + math + sci + sst + hin;
        avg /= 5;
        if (avg >= 90) {
            System.out.println("Your grade is A");
        }
        else if (avg >= 80) {
            System.out.println("Your grade is B");
        }
        else if (avg >= 70) {
            System.out.println("Your grade is C");
        }
        else if (avg >= 60) {
            System.out.println("Your grade is D");
        }
        else if (avg >= 40) {
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("You failed!");
        }
    }
}