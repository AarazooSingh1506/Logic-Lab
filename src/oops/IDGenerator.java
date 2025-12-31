package oops;

public class IDGenerator {
	
	private static int next = 1000;
	public static int nextId() {
		int currentId = next;
		next++;
		return currentId;
	}

}
