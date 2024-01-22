package com.ibm.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.model.Customer;
import com.ibm.model.Order;

public class MySessionFactory {
	private static SessionFactory sessionFactory=null;
	static{
		try {
			sessionFactory = new Configuration().configure()
	        		.addAnnotatedClass(Order.class).addAnnotatedClass(Customer.class).buildSessionFactory();
	    } catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() throws Exception
	{
		return sessionFactory;
	} 
}
