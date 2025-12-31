import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words =sentence.split(" ");

        for (String word: words){
            String rev ="";

            for(int i= word.length() - 1; i>=0;i--){
                rev = rev + word.charAt(i);
            }
            System.out.print(rev + " ");

        }
        input.close();


    }

}
