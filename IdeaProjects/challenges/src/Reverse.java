import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Welcome To Reverse String");
        String input = "Mumbai";
        String reverse = "";

        for(int i = input.length() - 1; i >=0;i--) {
            reverse += input.charAt(i);
        }
        System.out.println(reverse);
    }
}
//Reverse a String
//	Task: Print the reverse of a given string.
//	Example Input: "Mumbai"
//	Expected Output: "iabmuM"
