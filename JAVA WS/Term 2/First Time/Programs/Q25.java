import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = in.nextLine();
        word = word.toLowerCase();
        int v = 0, c = 0;
        String[] lettersInWord = word.split("");
        for (String letter : lettersInWord) {
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("There are " + v + " vovels in the word " + word + " and are " + c + " consonants in the word " + word);
    }
}
