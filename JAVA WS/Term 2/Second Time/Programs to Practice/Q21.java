public class Q21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
