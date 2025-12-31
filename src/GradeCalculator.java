import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for(int i = 1;i<=5;i++){
            System.out.print("Enter marks of the subject "+i+":");
            total += input.nextInt();

        }

        double percentage = total/5.0;
        System.out.println("Percentage: "+ percentage);

        if(percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 75)
            System.out.println("Grade B");
        else if (percentage >= 60)
            System.out.println("Grade C");
        else if(percentage >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

        input.close();
    }


}
