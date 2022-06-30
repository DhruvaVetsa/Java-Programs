import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a word : ");
        String word = obj.nextLine();
        String reversedWord = "";
        for (int i = word.length(); i >= 0; i--) {
            String[] reversedWordArr = word.split("", -1);
            reversedWord = reversedWord + reversedWordArr[i];
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        }
        else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}