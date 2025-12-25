public class MinValue {
    public static void main(String[] args) {
        int[] arr = {10, -3, 25, 7, 0};
        int min = arr[0];

        for(int i  = 1;i<arr.length;i++) {
            if( arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(min);


    }
}


//Find the smallest element in an array
//	Task: Given an integer array, find and print the minimum value using a for loop.
//	Example Input: {10, -3, 25, 7, 0}
//	Expected Output: -3