package com.map.dom;

public class MobileHome extends House {

	public MobileHome(String name, int x, int y, Ematerial mat) {
		super(name, x, y, mat);
	}
	public MobileHome(String name, int x, int y, Ematerial mat, Human owner) {
		super(name, x, y, mat, owner);
	}

}
