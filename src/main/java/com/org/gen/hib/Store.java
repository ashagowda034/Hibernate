package com.org.gen.hib;

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;    
    
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		     System.out.println("Hello World!");
		     Configuration cfg= new Configuration();
		     cfg.configure("hibernate.cfg.xml");
		    SessionFactory factory=cfg.buildSessionFactory();  
		    Session sess=factory.openSession();  
		      
		    sess.beginTransaction();
		      
		    Employee e1=new Employee();    
		    e1.setName("Ravi Malik");    
		    e1.setEmail("ravi@gmail.com");    
		        
		    Address address1=new Address();    
		    address1.setAddressLine1("G-21,Lohia nagar");    
		    address1.setCity("Ghaziabad");    
		    address1.setState("UP");    
		    address1.setCountry("India");    
		    address1.setPincode(201301);
		    e1.setAddress(address1);    
		    address1.setEmployee(e1); 
		    
		    sess.save(e1);
		    sess.save(address1);
		    sess.getTransaction().commit();    
		    System.out.println("success");   
	}

}
