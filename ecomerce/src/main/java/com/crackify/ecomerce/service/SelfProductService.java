package com.crackify.ecomerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crackify.ecomerce.model.Product;
import com.crackify.ecomerce.model.ProductFake;
import com.crackify.ecomerce.repository.SelfProductRepositoryImpl;


@Service("fakeService")
public class SelfProductService implements ProductService{

	@Autowired
	SelfProductRepositoryImpl productRepositoryImpl;
	
	@Override
	public Product getProductById(Long id) {
		return productRepositoryImpl.getProductById(id);
	}

	@Override
	public Product createProduct(Product product) {
		return productRepositoryImpl.createProduct(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepositoryImpl.getProducts();
	}



	@Override
	public boolean deleteProductById(Long id) {
		return productRepositoryImpl.deleteProduct(id);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		return productRepositoryImpl.updateProduct(id,product);
	}

	@Override
	public ProductFake getFakeProductById(Long id) {
		return null;
	}

	@Override
	public ProductFake createProduct(ProductFake product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductFake> getAllFakeProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductFake updateProduct(Long id, ProductFake product) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
