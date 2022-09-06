import java.util.Scanner;

public class Main {
    public static final float PI = 3.14f;
    public static void main(String[] args) {
        Scanner scannerOBJ = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        float r = scannerOBJ.nextFloat();
        System.out.println("If the Radius is " + r + ": - , \nThe area of the circle is " + (PI * r * r) + " unit-square \nThe circumfrence of the circle is " + (2 * PI * r) + " units\nVolume of the sphere is " + ((4 / 3) * PI * r * r * r) + " unit-cubed \nTotal Surface area is " + (4 * PI * r * r) + " unit-square.");
    }
}
