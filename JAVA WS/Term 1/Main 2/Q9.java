import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Please enter The temperature in fahrenheit : - ");
        fahrenheit = scannerObj.nextDouble();
        System.out.println(fahrenheit + " °F = " + ((5/9) * (fahrenheit - 32)) + " °C");
    }
}
