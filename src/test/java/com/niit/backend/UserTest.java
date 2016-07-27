package com.niit.backend;


	import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.UserDAO;



	public class UserTest {
		public static void main(String[] args) 
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.backend");
			context.refresh();
			UserDAO userDAO = (UserDAO) context.getBean("userDAO");
			User user = (User) context.getBean("user");
			user.setId("1");
           user.setName("vinni");
            user.setMail("vi");
            user.setAddress("col");
            user.setPassword("sai");
            
			
			userDAO.saveOrUpdate(user);
			
			userDAO.delete("CAT_1");
			userDAO.get("CAT_1");
		
			List<User>  list =    userDAO.list();
			
			for(User us : list)
			{
				System.out.println(us.getId()  + ":" +  us.getName() + ":" +  us.getMail() + ":" +  us.getAddress() + ":" +  us.getPassword() );
			}
				
				
			context.close();
			
		}
	}





