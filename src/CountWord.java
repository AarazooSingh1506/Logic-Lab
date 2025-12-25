import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = input.nextLine().toLowerCase();

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            // print only first occurrence
            boolean freq = false;
            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    freq = true;
                    break;
                }
            }

            if (!freq) {
                System.out.println(words[i] + " : " + count);
            }
        }

        input.close();
    }
}

