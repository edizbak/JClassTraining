package com.map.dom;

public abstract class Animal extends Being {
	protected Human owner;
	public Animal(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
		this.owner = null;
	}
	
	public Animal(String name, int x, int y, boolean inAir, Human owner) {
		super(name, x, y, inAir);
		this.owner = owner;
	}
	
	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

	public abstract String communicate();
}
