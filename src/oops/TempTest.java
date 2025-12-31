package oops;

public class TempTest {
	public static void main(String[] args) {
		 
		Temperature t1 = new Temperature(25);
		
		System.out.println(t1.toFahrenheit());
		
		Temperature t2 = t1.withCelcius(30);
		
		System.out.println(t2.toFahrenheit());
		System.out.println(t1.toFahrenheit());
	}

}
