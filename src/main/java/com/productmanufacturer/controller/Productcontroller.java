package com.productmanufacturer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.productmanufacturer.model.Product;
import com.productmanufacturer.service.ProductService;

import java.util.List;
import java.util.Map;

/*import com.productmanufacturer.dao.ProductRepository;
import com.productmanufacturer.model.Product;*/


@RestController
public class Productcontroller {
	
	@Value("${server.port}")
	int port;
	
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	ProductService prodservice;
	
	@PostMapping("/createprod")
	public String addProduct(@RequestBody List<Product> productList ) {
		
	  String response = prodservice.createProduct(productList);
		
		return response;
		
		
		
	}
	@GetMapping("/getallprod")
	public List<Product> getProducts() {
		
		return prodservice.displayAll();
		
	}
	
	@GetMapping("/getprodbyid/{id}")
    public  Product getProductByID(@PathVariable("id") long prodID) {
		
		return prodservice.displayById(prodID);
	}
	
	
	@PutMapping("/updateprod/{id}")
	public void updateProduct() {
		
	}
	@DeleteMapping("/deleteprod/{id}")
	public String deleteProduct(@PathVariable("id") long prodID) {
		
		return prodservice.deleteProd(prodID);
		
	}
	
}
