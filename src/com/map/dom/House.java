package com.map.dom;

public class House extends SpatialElement {
	private int price;
	private Ematerial material;
	protected Human owner;

	public House(String name, int x, int y, Ematerial mat, int price) {
		super(name, x, y, false);
		this.material = mat;
		this.price = price;
		this.owner = null;
	}
	
	public House(String name, int x, int y, Ematerial mat, int price, Human owner) {
		super(name, x, y, false);
		this.material = mat;
		this.price = price;
		this.owner = owner;
	}
	
	public House(String name, int x, int y, Ematerial mat) {
		super(name, x, y, false);
		this.material = mat;
		this.owner = null;
	}
	
	public House(String name, int x, int y, Ematerial mat, Human owner) {
		super(name, x, y, false);
		this.material = mat;
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Ematerial getMaterial() {
		return material;
	}

	public void setMaterial(Ematerial material) {
		this.material = material;
	}

	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

}
