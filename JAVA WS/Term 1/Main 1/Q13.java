public class Q13 {
    public static void main(String[] args) {
        int x = 2, y = 7, z = 0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x++ + --y + x + y;
        System.out.println("z = " + z);
    }
}
