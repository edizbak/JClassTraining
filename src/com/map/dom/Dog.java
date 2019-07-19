package com.map.dom;

public class Dog extends Animal {

	public Dog(String name, int x, int y) {
		super(name, x, y, false);
	}
	
	public Dog(String name, int x, int y, Human owner) {
		super(name, x, y, false, owner);
	}
	
	public String communicate() {
		return "";
	}
}
