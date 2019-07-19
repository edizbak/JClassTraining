package com.map.dom;

public class Eagle extends Animal {

	public Eagle(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
	}
	
	public Eagle(String name, int x, int y, boolean inAir, Human owner) {
		super(name, x, y, inAir, owner);
	}
	
	public String communicate() {
		return "";
	}
}
