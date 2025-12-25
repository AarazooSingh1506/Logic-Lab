import java.util.Scanner;

class challenges {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication calculator\n");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);


    }

    public static void printMultiplicationTable(int num) {
        int i =1;
        while (i <= 10){
            System.out.println((num + "x" + i + "=" + (num * i)));
            i++;
        }



    }


}
