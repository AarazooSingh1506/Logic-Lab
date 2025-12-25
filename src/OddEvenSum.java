import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter how many numbers you want : ");
        int number = input.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        for(int i =1; i<=number;i++){
            System.out.print("Enter number " + i +" :");
            int num = input.nextInt();

            if(num % 2 == 0)
                evenSum = evenSum + num;
            else
                oddSum = oddSum + num;
        }
        System.out.println("Sum of even numbers is : " + evenSum );
        System.out.println("Sum of odd numbers is : " + oddSum);
        input.close();

    }
}
