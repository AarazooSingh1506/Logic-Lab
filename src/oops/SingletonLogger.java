package oops;

public class SingletonLogger {
	private static SingletonLogger instance;
	private static final String PREFIX = "[APP]";
	
	private SingletonLogger() {
		
	}
	
	public static SingletonLogger getInstance() {
		if (instance == null) {
			instance = new SingletonLogger();
			
		}
		return instance;
	}
	public void log(String message) {
		System.out.println(PREFIX + message);
	}
	public static void main(String[] args) {
		SingletonLogger logger1 = SingletonLogger.getInstance();
		SingletonLogger logger2 = SingletonLogger.getInstance();
		System.out.println(logger1 == logger2);
		logger1.log("Started");
	
  }
	

}
