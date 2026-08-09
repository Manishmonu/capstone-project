package com.crackify.ecomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crackify.ecomerce.model.Product;
import com.crackify.ecomerce.model.ProductFake;
import com.crackify.ecomerce.service.ProductService;
import com.crackify.ecomerce.utils.EcomerceUtil;

@RestController
public class ProductController {

	@Autowired
	@Qualifier("externalStoreService")
	ProductService productService;

	@PostMapping(EcomerceUtil.CREATE_PRODUCT)
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product savedProduct = productService.createProduct(product);
		if (savedProduct == null ) {
			throw new RuntimeException("Product creation failed");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
	}

	/*
	 * @GetMapping(EcomerceUtil.GET_SINGLE_PRODUCT) public ResponseEntity<Product>
	 * getSingleProduct(@PathVariable Long id) { Product product =
	 * productService.getProductById(id); if (product == null) {
	 * ResponseEntity<Product> responseEntity = ResponseEntity.notFound().build();
	 * return responseEntity; } ResponseEntity<Product> responseEntity =
	 * ResponseEntity.ok().body(product); return responseEntity; }
	 * 
	 * @GetMapping(EcomerceUtil.GET_ALL_PRODUCT) public
	 * ResponseEntity<List<Product>> getProducts() { List<Product> product =
	 * productService.getAllProduct(); if (product == null) {
	 * ResponseEntity<List<Product>> responseEntity =
	 * ResponseEntity.notFound().build(); return responseEntity; }
	 * ResponseEntity<List<Product>> responseEntity =
	 * ResponseEntity.ok().body(product); return responseEntity; }
	 */

	@DeleteMapping(EcomerceUtil.DELETE_PRODUCT)
	public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
		if (productService.deleteProductById(id)) {
			return ResponseEntity.ok("Product is deleted successfully");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Your product is null or not found");
		}
	}

	@PostMapping(EcomerceUtil.UPDATE_PRODUCT)
	public ResponseEntity<String> updateProduct(@RequestBody Product product, @PathVariable Long id) {
		if (product!=null && productService.updateProduct(id, product)!=null) {
			return ResponseEntity.ok("User updated successfully");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with id " + id + " not found");
		}
	}
	
	@GetMapping(EcomerceUtil.GET_SINGLE_PRODUCT)
	public ResponseEntity<ProductFake> getFakeSingleProduct(@PathVariable Long id) {
		ProductFake product = productService.getFakeProductById(id);
		if (product == null) {
			ResponseEntity<ProductFake> responseEntity = ResponseEntity.notFound().build();
			return responseEntity;
		}
		ResponseEntity<ProductFake> responseEntity = ResponseEntity.ok().body(product);
		return responseEntity;
	}

	@GetMapping(EcomerceUtil.GET_ALL_PRODUCT)
	public ResponseEntity<List<ProductFake>> getFakeProducts() {
		List<ProductFake> product = productService.getAllFakeProduct();
		if (product == null) {
			ResponseEntity<List<ProductFake>> responseEntity = ResponseEntity.notFound().build();
			return responseEntity;
		}
		ResponseEntity<List<ProductFake>> responseEntity = ResponseEntity.ok().body(product);
		return responseEntity;
	}

}
