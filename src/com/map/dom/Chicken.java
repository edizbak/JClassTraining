package com.map.dom;

public class Chicken extends Animal {

	public Chicken(String name, int x, int y) {
		super(name, x, y, false);
	}
	public Chicken(String name, int x, int y, Human owner) {
		super(name, x, y, false, owner);
	}
	
	public String communicate() {
		return "";
	}
	
}
