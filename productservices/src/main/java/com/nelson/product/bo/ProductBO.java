package com.nelson.product.bo;

import com.nelson.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);
}
