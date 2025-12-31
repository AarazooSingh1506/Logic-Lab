package oops;

import java.util.Iterator;

public class TestStopwatch {
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		
		stopwatch.start();
		
		for(int i = 0; i < 1000;i++) {
			stopwatch.incrementTick();
		}
		
		stopwatch.stop();
		System.out.println(stopwatch.elapsed());
		
		stopwatch.reset();
		System.out.println(stopwatch.elapsed());
	}

}
