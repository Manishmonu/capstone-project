package com.crackify.ecomerce.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crackify.ecomerce.configurations.RestTemplateConfiguration;
import com.crackify.ecomerce.model.Product;
import com.crackify.ecomerce.model.ProductFake;
import com.crackify.ecomerce.utils.EcomerceUtil;

@Service
public class ExternalStoreService implements ProductService {

	@Autowired
	RestTemplate restTemplate;

	public ExternalStoreService() {
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProductById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductFake getFakeProductById(Long id) {
		return restTemplate.getForEntity(EcomerceUtil.GET_SINGLE_FAKE_PRODUCT, ProductFake.class, id).getBody();
	}

	@Override
	public ProductFake createProduct(ProductFake product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductFake> getAllFakeProduct() {
		ProductFake[] products = restTemplate.getForEntity(EcomerceUtil.FAKE_API, ProductFake[].class).getBody();

		return Arrays.asList(products);
	}

	@Override
	public ProductFake updateProduct(Long id, ProductFake product) {
		// TODO Auto-generated method stub
		return null;
	}

}
