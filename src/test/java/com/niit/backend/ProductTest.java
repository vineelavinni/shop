package com.niit.backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.ProductDAO;

import com.niit.backend.Product;


public class ProductTest {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		product.setId("1");
		product.setName("tab");
		product.setDescription("mic");
		
		productDAO.saveOrUpdate(product);
		
		productDAO.delete("CAT_1");
	    productDAO.get("CAT_1");
	
		List<Product>  list =    productDAO.list();
		
		for(Product pro : list)
		{
			System.out.println(pro.getId()  + ":" +  pro.getName()  + ":"+  pro.getDescription() );
		}
			
			
		context.close();
		
	}

}
