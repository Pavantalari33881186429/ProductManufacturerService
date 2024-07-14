package com.productmanufacturer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {
	
	@Id()
	private long productID;
	@Column(name = "wproductname")
	private String productName;
	@Column(name = "wproductprice")
	private long productPrice;
	//Default Constructor
	public Product() {
		
	}
	//Parameterized Constructor
	public Product(long productID, String productName, long productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	

}
