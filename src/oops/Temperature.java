package oops;

public class Temperature {
	private final double celcius;
	
	public Temperature(double celcius) {
		this.celcius = celcius;
	}
	
	public double toFahrenheit() {
		return  (celcius * 9/5) + 32;
	}
	
	public Temperature withCelcius(double newCelcius) {
		return new Temperature(newCelcius);
	}
	
	public double getCelcius() {
		return celcius;
	}

}
