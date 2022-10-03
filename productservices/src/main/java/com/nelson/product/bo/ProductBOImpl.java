package com.nelson.product.bo;

import com.nelson.product.dao.ProductDAO;
import com.nelson.product.dao.ProductDAOImpl;
import com.nelson.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
