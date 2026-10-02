package com.spring.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	

	@Autowired
	@Qualifier("indian")
	private IFoodMenu foodMenu;
	
	@Autowired
	private IFoodMenu italian;
	
	private IFoodMenu newMenu;
	
	
	public Restaurant(@Qualifier("chinese")IFoodMenu newMenu ) {
	    super();
		this.newMenu = newMenu;
	
	}


   public List<String> showItems(String foodType) {
		
	   List<String> menuItems=new ArrayList<>();
		if(foodType.equalsIgnoreCase("in")) {
			menuItems= foodMenu.itemsAvailable();
		}
		else if(foodType.equalsIgnoreCase("it")) {
			menuItems= italian.itemsAvailable();
			
		}else if(foodType.equalsIgnoreCase("ch")) {
			menuItems= newMenu.itemsAvailable();
		}
		else {
			menuItems=Arrays.asList("No items available ");
		}
		
		return menuItems;
		
	}

}
