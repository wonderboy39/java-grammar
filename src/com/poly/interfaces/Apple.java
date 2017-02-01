package com.poly.interfaces;

public class Apple implements PrintPriceBehavior{
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
