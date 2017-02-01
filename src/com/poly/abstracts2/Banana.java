package com.poly.abstracts2;

public class Banana extends Fruits implements DutyBehavior{
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
	@Override
	public void printDuty() {
		// TODO Auto-generated method stub
		System.out.println("BANANA, DUTY EXISTS !!" );
	}
}
