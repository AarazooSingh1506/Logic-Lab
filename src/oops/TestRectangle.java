package oops;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setWidth(10);
		r.setHeight(15);
		
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		r.setWidth(0);
		r.setHeight(0);
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		
	
	}

}
