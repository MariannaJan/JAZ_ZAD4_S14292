package domain.services;

import java.util.ArrayList;
import java.util.List;

import domain.Product;

public class ProductService {
	
	private static List<Product> db = new ArrayList<Product>();
	private static int currentId = 0;
	public List<Product> getAll(){
		return db;
	}

	public Product get(int id){
		for (Product p :db){
			if(p.getProductId()==id)
				return p;
		}
		return null;
	}
	
	public void add(Product p){
		p.setProductId(++currentId);;
		db.add(p);
	}
	
	public void update(Product product){
		for(Product p :db){
			if(p.getProductId()==product.getProductId()){
				p.setName(product.getName());
				p.setCategory(product.getCategory());
				p.setPrice(product.getPrice());
			}
		}
	}
	
	public void delete(Product p){
		db.remove(p);
	}

}
