package com.map.dom;

public abstract class Being extends SpatialElement {
	protected int maxSpeed = 1;
	
	public Being(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
