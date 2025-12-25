import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 1000;
        int choice = 0;

        do {
            System.out.println("\n1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    int deposit = input.nextInt();
                    balance = balance + deposit;
                    System.out.print("New Balance" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    int withdraw = input.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.print("New Balance: " + balance);
                    } else {
                        System.out.print("Insufficient amount in tha account");
                    }
                    break;

                case 4:
                    System.out.print("Visit Again, Thankyou");
                    break;

                default:
                    System.out.print("Inavlid");

            }

        } while(true);

    }
}
