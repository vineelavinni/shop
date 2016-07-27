package com.niit.backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.SupplierDAO;
import com.niit.backend.Supplier;
public class SupplierTest {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("2");
		supplier.setName("manu");
		supplier.setDescription("girl");
		supplierDAO.saveOrUpdate(supplier);
		
		supplierDAO.delete("CAT_1");
		supplierDAO.get("CAT_1");
	
		List<Supplier>  list = supplierDAO.list();
		
		for(Supplier cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
		}
			
			
		context.close();
		
	}
}





