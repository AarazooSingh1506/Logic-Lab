public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min \n");
        int[] numArr =ArrayUtility.inputArray();
        int min = min(numArr);
        int max = max(numArr);
        System.out.println("Max of the Array is:  " + max);
        System.out.println("Min of the Array is: " + min);

    }
    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while( i < numArr.length) {
            if(min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;

        }
    public static int max(int[] numArr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while( i < numArr.length) {
            if(max < numArr[i]) {
                max = numArr[i];
            }
            i++;

        }
        return max;

    }

    }



