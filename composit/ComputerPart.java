package com.composit;

import java.util.ArrayList;
import java.util.List;



interface Component {

	void showPrice();
}
class Leaf implements Component{
	String name;
	int price;
	
	
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public void showPrice() {
		
		System.out.println(name + ": " + price);
		
		
	}
	
	
}
class Composit implements Component
{ 
	String name;
List<Component> component = new ArrayList<>();




   public Composit(String name) {
	super();
	this.name = name;
}

public void addComponent(Component com)
   {
	   component.add(com);
   }

	@Override
	public void showPrice() {
		
		System.out.println(name );
		for(Component c: component)
		{
			c.showPrice();
		}
	}
	
}