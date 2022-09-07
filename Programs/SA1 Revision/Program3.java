import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        float distance, time;
        System.out.println("Enter the distance travelled by an Aeroplane in kms : ");
        Scanner in = new Scanner(System.in);
        distance = in.nextFloat();
        System.out.println("Enter the time taken by Aeroplane in mins:");
        time = in.nextFloat();
        System.out.println("The speed of the Aeroplane in km/h is : " + (distance / (time / 60)));
    }
}
