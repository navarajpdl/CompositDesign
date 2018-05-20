package com.composit;

public class CompositTest {

	public static void main(String[] args) {
		Leaf hd =new Leaf("hard drive", 4000);
		Leaf mouse =new Leaf("Mouse", 500);
		Leaf monitor =new Leaf("hard drive", 8000);
		Leaf ram =new Leaf("Ram", 2000);
		Leaf cpu =new Leaf("CPU", 9000);
	
		
		Composit ph = new Composit("periphereal");
		Composit cabinet = new Composit("cabinet");
		Composit mb = new Composit("MotherBoard");
		Composit computer = new Composit("Computer");

	
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ph.showPrice();
}}
