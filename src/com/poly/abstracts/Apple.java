package com.poly.abstracts;

public class Apple extends Fruits{
	private int price;
	public Apple(){}
	public void setPrice(final int price){
		this.price = price;
	}
	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("APPLE :: " + String.valueOf(this.price) + " Won.");
	}

}
