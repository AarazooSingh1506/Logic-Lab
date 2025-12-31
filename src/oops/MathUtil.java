package oops;

public class MathUtil {
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	// value between min and max (clamp)
	
	public static int clamp( int value, int min,int max) {
		if(value < min) {
			return min;
		}
		if(value > max) {
			return max;
		}
		return value;
		
	}

}
