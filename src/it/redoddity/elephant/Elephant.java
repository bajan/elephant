package it.redoddity.elephant;

public class Elephant {
	
	private Integer full = 0;
	private Boolean feeded = false;
	
	private String name = null;

	public Elephant(String name)
	{
		this.name = name;
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
