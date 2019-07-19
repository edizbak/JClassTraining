package com.map.dom;

import java.util.ArrayList;

public class Human extends Being {
	private int money = 0;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	private ArrayList<House> houses = new ArrayList<House>();
	
	public Human(String name, int x, int y) {
		super(name, x, y, false);
	}
	public Human(String name, int x, int y, int money) {
		super(name, x, y, false);
		this.money = money;
	}

}
