package com.poly.abstracts2;

public class Apple extends Fruits implements DutyBehavior{
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
	@Override
	public void printDuty() {
		// TODO Auto-generated method stub
		System.out.println("APPLE, DUTY FREE !!");
	}
}
