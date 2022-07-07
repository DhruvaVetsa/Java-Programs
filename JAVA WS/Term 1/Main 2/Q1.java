import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String name, gender;
        int age;
        System.out.println("Please enter the following : ");
        System.out.print("\tFull Name : ");
        name = scannerObj.nextLine();
        System.out.print("\tAge : ");
        age = scannerObj.nextInt();
        System.out.print("\tGender : ");
        gender = scannerObj.next();
        System.out.println("====================================================================");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gender is " + gender);
        System.out.println("====================================================================");
    }    
}
