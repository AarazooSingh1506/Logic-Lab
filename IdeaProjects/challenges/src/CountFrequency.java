import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.nextLine().toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    count++;
                }

            }
            if (count > 0) {
                System.out.println(ch + ":" + count);
            }
        }

    }
}
