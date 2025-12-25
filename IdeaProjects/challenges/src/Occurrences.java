import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number You Want To Find:  ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("Your element is found " + occurrences + " times in the array");


    }

    public static int noOfOccurrences(int[ ]numArr,int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length) {
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
