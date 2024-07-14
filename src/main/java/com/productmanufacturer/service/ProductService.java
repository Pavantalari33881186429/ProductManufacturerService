package com.productmanufacturer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.productmanufacturer.dao.ProductRepository;
import com.productmanufacturer.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;
	@Autowired
	Product product;
	
	public String createProduct(List<Product> prod) {
		
		
		
		if(prod.isEmpty()) {
			
			return "Create product Service Failed";
		}
		else {
			
		
			for( Product p : prod) {
				
				product = new Product(p.getProductID(),p.getProductName(), p.getProductPrice());
				
				repo.save(product);
				
				
			}
			return "Product Creation Successfull";
		}
	}
	
	public List<Product> displayAll(){
		
		
		return repo.findAll();
		
	}
	
   public Product displayById(long prodID){
		
	   Optional<Product> prod = repo.findById(prodID);
	   
	   
	   product = new Product(prod.get().getProductID(),prod.get().getProductName(), prod.get().getProductPrice());
		return product;
		
	
   }
   
   public String deleteProd(long prodID) {
	   
	   String response = null;
	   try {
	   repo.deleteById(prodID);
	   response = "Product deleted successfully";
	   }
	   catch(Exception e) {
		   System.out.println("Product doesnot exist");
	   }
	
	   return response;
   }

}
