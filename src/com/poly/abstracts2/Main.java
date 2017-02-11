package com.poly.abstracts2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String [] args){
		List<Fruits> fruits = new ArrayList<Fruits>();
		List<DutyBehavior> duties = new ArrayList<DutyBehavior>();
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		Mango mango = new Mango();
		
		apple.setPrice(300);
		fruits.add(apple);
		duties.add(apple);
		
		banana.setPrice(800);
		fruits.add(banana);
		duties.add(banana);
		
		mango.setPrice(1000);
		fruits.add(mango);
		duties.add(mango);
		
		System.out.println("----------------");
		System.out.println("prices of fruits... ");
		for(Fruits fruit : fruits){
			fruit.printPrice();
			fruit.printFeatures();
			System.out.println();
		}
		System.out.println("----------------");
		System.out.println("Duty of each items ...");
		for(DutyBehavior duty : duties ){
			duty.printDuty();
		}
	}
}