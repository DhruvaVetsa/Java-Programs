import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // public static List<Character> convertStringToCharList(String str) {
    // return ch;
    // }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence with CAPS only and numbers. No spaces and special charecters : ");
        String str = in.nextLine();
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            char charecter = chars[i];
            switch (charecter) {
                case 'A':
                    System.out.print("* * * *\n*     *\n* * * *\n*     *\n*     *");
                    break;
                case 'B':
                    System.out.print("* * * *\n*     *\n* * * *\n*     *\n* * * *");
                    break;
                case 'C':
                    System.out.print("* * * *\n*\n*\n*     \n* * * *");
                    break;
                case 'D':
                    System.out.print("*  *\n*    *\n*     *\n*    *\n* * *");
                    break;
                case 'E':
                    System.out.print("* * * *\n*     \n* * * *\n*     \n* * * *");
                    break;
                case 'F':
                    System.out.print("* * * *\n* \n* * * *\n* \n* ");
                    break;
                case 'G':
                    System.out.print("* * * *\n*     \n*   * *\n*     *\n* * * *");
                    break;
                case 'H':
                    System.out.print("*     *\n*     *\n* * * *\n*     *\n*     *");
                    break;
                case 'I':
                    System.out.print("* * * *\n   *\n   *\n   *\n* * * *");
                    break;
                case 'J':
                    System.out.print("* * * *\n   *\n   *\n   *\n* *");
                    break;
                case 'K':
                    System.out.print("*     *\n*   * \n* *\n*   *\n*     *");
                    break;
                case 'L':
                    System.out.print("* \n* \n* \n*     \n* * * *");
                    break;
                case 'M':
                    System.out.print("* * * *\n*  *  *\n*  *  *\n*     *\n*     *");
                    break;
                case 'N':
                    System.out.print("* * * *\n*     *\n*     *\n*     *\n*     *");
                    break;
                case 'O':
                    System.out.print("* * * *\n*     *\n*     *\n*     *\n* * * *");
                    break;
                case 'P':
                    System.out.print("* * * *\n*     *\n* * * *\n*     \n* ");
                    break;
                case 'Q':
                    System.out.print("* * * *\n*     *\n*     *\n* * * *\n     *");
                    break;
                case 'R':
                    System.out.print("* * * *\n*     *\n* * * *\n*   *     \n*     *");
                    break;
                case 'S':
                    System.out.print("* * * *\n*     \n* * * *\n      *\n* * * *");
                    break;
                case 'T':
                    System.out.print("* * * *\n   *\n   *\n   *\n   *");
                    break;
                case 'U':
                    System.out.print("*     *\n*     *\n*     *\n*     *\n* * * *");
                    break;
                case 'V':
                    System.out.print("*    *\n*    *\n*    *\n *  *\n   *");
                    break;
                case 'W':
                    System.out.print("*     *\n*     *\n*  *  *\n*  *  *\n* * * *");
                    break;
                case 'X':
                    System.out.print("*     *\n *   *\n   *\n  *  *\n*     *");
                    break;
                case 'Y':
                    System.out.print("*     *\n *   *\n   *\n  *  \n*     ");
                    break;
                case 'Z':
                    System.out.print("* * * *\n     *\n    *\n  *\n* * * * ");
                    break;
                case '1':
                    System.out.print("   *\n*  *\n   *\n   *\n   *");
                    break;
                case '2':
                    System.out.print("* * * *\n      *\n* * * *\n*     \n* * * *");
                    break;
                case '3':
                    System.out.print("* * * *\n      *\n* * * *\n      *\n* * * *");
                    break;
                case '4':
                    System.out.print("*     *\n*     *\n* * * *\n      *\n      *");
                    break;
                case '5':
                    System.out.print("* * * *\n*     \n  * * *\n      *\n* * * *");
                    break;
                case '6':
                    System.out.print("* * * *\n*     \n* * * *\n*     *\n* * * *");
                    break;
                case '7':
                    System.out.print("* * * *\n      *\n      *\n      *\n      *");
                    break;
                case '8':
                    System.out.print("* * * *\n *   *\n* * * *\n *   *\n* * * *");
                    break;
                case '9':
                    System.out.print("* * * *\n*     *\n* * * *\n      *\n* * * *");
                    break;
                case '0':
                    System.out.print("* * * *\n*     *\n*     *\n*     *\n* * * *");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }
}
