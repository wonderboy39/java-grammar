package com.poly.abstracts;

public class Banana extends Fruits{
	private int price;
	public Banana(){}
	public void setPrice(final int price){
		this.price = price;
	}
	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("BANANA :: " + String.valueOf(this.price) + " Won.");
	}
	
}
