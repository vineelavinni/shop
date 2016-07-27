package com.niit.backend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


	@Entity
	@Table
	@Component
	public class User {
	
		@Id
		
		private String id;
	    private String name;
		
		private String mail;
		
		private String address;
		
		private String password;
		
		private Integer mobile;
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Integer getMobile() {
			return mobile;
		}

		public void setMobile(Integer mobile) {
			this.mobile = mobile;
		}

		
		
		
		}