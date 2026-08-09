package com.crackify.ecomerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	private Long productId;
	private String productTitle;
	private String productDescription;
	private Double productPrice;
	private Category productCategory;
	

}
