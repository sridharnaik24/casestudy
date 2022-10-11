package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private long prodId;
	private String prodName;
	private String prodDescrption;
	private String prodCategory;
	private double prodPrice;
	private String prodColor;
	private String prodImage;
	private int prodQuantity;
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDescrption() {
		return prodDescrption;
	}
	public void setProdDescrption(String prodDescrption) {
		this.prodDescrption = prodDescrption;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public Product(long prodId, String prodName, String prodDescrption, String prodCategory, double prodPrice,
			String prodColor, String prodImage, int prodQuantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDescrption = prodDescrption;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.prodColor = prodColor;
		this.prodImage = prodImage;
		this.prodQuantity = prodQuantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}