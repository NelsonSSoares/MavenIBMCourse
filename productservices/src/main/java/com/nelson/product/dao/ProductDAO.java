package com.nelson.product.dao;

import com.nelson.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(Product product);
}
