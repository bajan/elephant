package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private Boolean feeded = false;
	private Color color = Color.GRAY;
	private String name = null;

	public Elephant(String name)
	{
		this.name = name;
	}
	
	
	public boolean isEmpty() {
		return !this.feeded;
	}

	public void feed() {
		this.feeded = true;	
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void growOneYear() {
		// TODO Auto-generated method stub
		
	}

	public void setColor(Color green) {
		// TODO Auto-generated method stub
		
	}

	public Color getColor() {
		
		return this.color;
	}

	public void kick() {
		// TODO Auto-generated method stub
		
	}
}
