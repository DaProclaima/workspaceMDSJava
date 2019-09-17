package fr.mds.supcommerce.dao;

import java.util.ArrayList;

import fr.mds.supcommerce.model.Product;

public class ProductDAO {

	static ArrayList<Product> products = new ArrayList<>();
	
	static long idCounter = 0;
	
	public void addProduct(Product p) {
//		add product to DB
		p.setId(idCounter);
		idCounter++;
		products.add(p);
		System.out.println( p.getName()+ " is pushed in DB");
	}
	
	// liste generique: ici dit que ce sera une liste (array) d'objets de class Product. Ne prend qu'un type de class
	public static ArrayList<Product> getAllProducts() {
		return products;
	}
	
	static Product findProductById(long id) {
//		for each loop
		for(Product p : products) {
			if(p.getId() == id) {
				return p;
//			} else {
//				return null;
			}
		}
			
		return null;
	}
}
