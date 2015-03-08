package com.rich.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rich.dto.Address;
import com.rich.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("SecondUser");
		
		Address address = new Address();
		address.setStreet("Street");
		address.setCity("city");
		address.setState("state");
		address.setZipcode("00000");
		
		user.setAddress(address);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
