import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Choice to convert: ");
        String choice = input.next();

        if(choice.equals("C")) {
            System.out.print("Enter temperature in Celsius: ");
            double c = input.nextDouble();
            System.out.println("Fahrenheit: " + (c * 9/5 +32));
        } else {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double f = input.nextDouble();
            System.out.print("Celsius: " + (f - 32) * 5/9);
        }
        input.close();
    }

}
