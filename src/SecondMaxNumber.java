import java.util.Scanner;

public class SecondMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for(int i = 0; i<n ;i++){
            arr[i]= input.nextInt();
        }

        int max =arr[0];
        int secondMax =arr[0];

        for(int i =1;i<n;i++){
            if(arr[i]>max){
                secondMax = max;
                max=arr[i];

            }
            else if(arr[i]>secondMax && arr[i] !=max){
                secondMax=arr[i];
            }
        }
        System.out.println("Second max Number is : " +secondMax);
        input.close();
    }
}
