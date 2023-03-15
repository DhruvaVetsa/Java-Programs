public class Q28 {
    public static void main(String[] args) {
        int[] numbers = {293, 311, 123, 143, 141, 293, 104, 193, 409, 937, 293, 737, 857, 274, 924, 103, 206, 205, 502};
        int index = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println("Number " + (index + 1) + " which is " + i + " is even.");
            }
            else {
                System.out.println("Number " + (index + 1) + " which is " + i + " is odd.");
            }
            index++;
        }
    }
}
