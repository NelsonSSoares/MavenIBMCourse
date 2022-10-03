package com.nelson.product.dao;
import java.util.HashMap;
import java.util.Map;

import com.nelson.product.dao.ProductDAO;
import com.nelson.product.dto.Product;

public class ProductDAOImpl implements ProductDAO{
	
	Map<Integer,Product> products = new HashMap<>();
	
	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
		
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

}
