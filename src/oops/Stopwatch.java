package oops;

public class Stopwatch {
	
	private boolean running;
	private int ticks;
	
	public void start() {
		running = true;
	}
	
	public void stop() {
		running = false;
	}
	
	public void reset() {
		ticks = 0;
	}
	
	public void incrementTick() {
		if(running) {
			ticks++;
		}
	}
	public int elapsed() {
		return ticks;
	}
	
	public boolean isRunning() {
		return running;
	}

}
