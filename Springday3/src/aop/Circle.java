package aop;

public class Circle {
	String name;

// public Circle() {System.out.println("in circle constructor");}
	
	public String getName() {
		return name;
		//throw new RuntimeException();
	}

	public void setName(String name) {
		System.out.println("setting name for the circle");
		this.name = name;
		//throw new RuntimeException();
		
	}
	
	public int getDia() {
		return 5;
	}

}
