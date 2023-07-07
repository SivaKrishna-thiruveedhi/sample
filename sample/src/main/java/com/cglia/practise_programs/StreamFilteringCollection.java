package com.cglia.practise_programs;

import java.util.*;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamFilteringCollection {
	
	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList2 = productsList.stream()
				.filter(p -> p.price > 30000)						// filtering data
				.map(p -> p.price) 									// fetching price
				.toList();					 						// collecting as list
		System.out.println(productPriceList2);
		
		Float totalPrice = productsList.stream()
				.map(product -> product.price)
				.reduce(0.0f,(sum, price) -> sum + price); 			// accumulating price
		System.out.println(totalPrice);
		
		// More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   						// accumulating price, by referring method of Float class  
        System.out.println(totalPrice2+"\n"+"*********************");
        
        // max() method to get max Product price     
        Product productA = productsList.stream()
        		.max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productA.price);    

        // min() method to get min Product price    
        Product productB = productsList.stream()
        		.min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productB.price);    
	}
}

















