package com.niit.backend;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CategoryDAO;

import com.niit.backend.Category;



public class CategoryTest {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("1");
		category.setName("vinni");
		category.setDescription("girl");
		categoryDAO.saveOrUpdate(category);
		
		categoryDAO.delete("CAT_1");
		categoryDAO.get("CAT_1");
	
		List<Category>  list =    categoryDAO.list();
		
		for(Category cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
		}
			
			
		context.close();
		
	}
}


