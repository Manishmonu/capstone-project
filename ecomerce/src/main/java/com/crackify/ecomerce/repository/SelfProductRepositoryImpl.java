package com.crackify.ecomerce.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crackify.ecomerce.model.Product;

@Repository
public class SelfProductRepositoryImpl {

	HashMap<Long, Product> productDB = new HashMap<>();
	

	public Product createProduct(Product product) {
	    productDB.put(product.getProductId(), product);
	    return product;
	}
	
	public Product getProductById(Long id) {
		return productDB.get(id);
	}

	public boolean deleteProduct(Long id) {

		Product product = productDB.get(id);
		if(product!=null) {
			productDB.remove(id);
			return true;
		}
		return false;
	}

	public Product updateProduct(Long id, Product product) {
		
		Product existingProduct = productDB.get(id);

	    if (existingProduct == null) {
	        return null;
	    }
	    if (product.getProductTitle() != null) {
	        existingProduct.setProductTitle(product.getProductTitle());
	    }
	    if (product.getProductDescription() != null) {
	        existingProduct.setProductDescription(product.getProductDescription());
	    }
	    if (product.getProductPrice() != null) {
	        existingProduct.setProductPrice(product.getProductPrice());
	    }
	    if (product.getProductCategory() != null) {
	        existingProduct.setProductCategory(product.getProductCategory());
	    }
	    productDB.put(id, existingProduct);
	    return existingProduct;
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		System.out.println(productDB.values());
		return new ArrayList<>(productDB.values());
	}
	
}
