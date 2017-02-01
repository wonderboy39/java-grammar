package com.poly.abstracts2;

public abstract class Fruits {
	private int price;
	public Fruits(){}
	public void setPrice(final int price){
		this.price = price;
	}
	public abstract void printPrice();
}
