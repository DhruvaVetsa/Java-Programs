import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = new char[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a charecter : ");
            array[i] = in.next().charAt(0);        
        }
        char[] reversedArray = new char[10];
        for (int j = 9; j >= 0; j--) {
            reversedArray[j] = array[9 - j];        
        }
        for (char c : reversedArray) {
            System.out.print(c + " ");
        }
    }
}
