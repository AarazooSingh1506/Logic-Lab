import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Prime number identifier");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        boolean IsPrime = isPrime(num);
        if (IsPrime){
            System.out.println("The number " + num + " is a prime number");
        }else{
            System.out.println("The number " + num + " is not a prime number");
        }
    }
    public static boolean isPrime(int num){
        if ( num <= 1){
            return false;
        }else{
            for(int i=2; i<=num/2;i++) {
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
