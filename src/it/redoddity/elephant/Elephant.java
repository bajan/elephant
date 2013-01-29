package it.redoddity.elephant;

public class Elephant {
	
	private Integer full = 0;

	public Elephant(String name) {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isEmpty() {
		if(full<10)
		return true;
		else return false;
	}

	public void feed() {
		full += 10;		
	}
}
