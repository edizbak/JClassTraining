package com.map.dom;

public abstract class SpatialElement {
	private String name;
	protected int x, y;
	protected boolean inAir;
	
	public SpatialElement(String name, int x, int y, boolean inAir) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.inAir = inAir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isInAir() {
		return inAir;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}
	
	
}
