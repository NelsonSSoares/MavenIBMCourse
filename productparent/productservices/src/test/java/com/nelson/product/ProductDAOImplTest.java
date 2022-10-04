package com.nelson.product;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nelson.product.dao.ProductDAO;
import com.nelson.product.dao.ProductDAOImpl;
import com.nelson.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Notebook");
		product.setDescription("ThinkPad");
		product.setPrice(800);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Notebook",result.getName());
		
	}

}
