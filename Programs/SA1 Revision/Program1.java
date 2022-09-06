import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        int student_marks, passing_marks;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the marks scored by the student : ");
        student_marks = in.nextInt();
        System.out.print("Please enter the passing marks : ");
        passing_marks = in.nextInt();
        System.out.println("You " + ((student_marks >= passing_marks)? "Passed" : "Failed"));
    }
}