import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks (out of hundred) in English Maths, Science, Social Studies and Hindi : ");
        float eng = in.nextFloat();
        float math = in.nextFloat();
        float sci = in.nextFloat();
        float sst = in.nextFloat();
        float hin = in.nextFloat();
        float average = (eng + math + sci + sst + hin) / 5;
        if (average > 90) {
            System.out.println("You got Grade A");
        }
        else if (average > 80) {
            System.out.println("You got Grade B");
        }
        else if (average > 70) {
            System.out.println("You got Grade C");
        }
        else if (average > 60) {
            System.out.println("You got Grade D");
        }
        else if (average > 40) {
            System.out.println("You got Grade E");
        }
        else {
            System.out.println("You failed!");
        }
    }
}

/*
 If Average >= 90 : Grade A
If Average >= 80 : Grade B
If Average >= 70: Grade C
If Average >= 60: Grade D
If Average >= 40: Grade E
Else
Fail

 */