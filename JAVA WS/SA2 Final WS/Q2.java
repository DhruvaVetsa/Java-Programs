public class Q2 {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
            if (i == 104 || i == 107 || i == 111) {
                continue;
            }
            System.out.print((char)i + " ");
        }
    }
}