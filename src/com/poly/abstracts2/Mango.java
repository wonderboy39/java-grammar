package com.poly.abstracts2;

public class Mango extends Fruits implements DutyBehavior{
	private int price;
	public Mango(){}
	public void setPrice(final int price){
		this.price = price;
	}
	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("MANGO :: " + String.valueOf(this.price) + " Won.");
	}
	@Override
	public void printDuty() {
		// TODO Auto-generated method stub
		System.out.println("MANGO, DUTY EXISTS !!" );
	}
}
