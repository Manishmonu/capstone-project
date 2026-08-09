package com.crackify.ecomerce.service;

import java.util.List;

import com.crackify.ecomerce.model.Product;
import com.crackify.ecomerce.model.ProductFake;

public interface ProductService {

	Product getProductById(Long id);
	Product createProduct(Product product);
	List<Product> getAllProduct();
	Product updateProduct(Long id, Product product);
	boolean deleteProductById(Long id);
	
	ProductFake getFakeProductById(Long id);
	ProductFake createProduct(ProductFake product);
	List<ProductFake> getAllFakeProduct();
	ProductFake updateProduct(Long id, ProductFake product);
}
