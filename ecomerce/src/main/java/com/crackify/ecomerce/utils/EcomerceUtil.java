package com.crackify.ecomerce.utils;

public class EcomerceUtil {
//	http://localhost:9998/product/createProduct
	
	public static final String GET_ALL_PRODUCT = "/products";
	public static final String CREATE_PRODUCT = "/products/createProduct";
	public static final String GET_SINGLE_PRODUCT = "/products/{id}";
	public static final String DELETE_PRODUCT = "/products/deleteProduct/{id}";
	public static final String UPDATE_PRODUCT = "/products/createProduct/{id}";
	

	public static final String FAKE_API = "https://fakestoreapi.com/products";
	public static final String GET_SINGLE_FAKE_PRODUCT = FAKE_API+"/{id}";
	public static final String DELETE_FAKE_PRODUCT = "/products/deleteProduct/{id}";
	public static final String UPDATE_FAKE_PRODUCT = "/products/createProduct/{id}";
}
