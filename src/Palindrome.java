import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        if (isPalindrome(str))
            System.out.println("String is a Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1 ;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
