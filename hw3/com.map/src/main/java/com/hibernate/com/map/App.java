package com.hibernate.com.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("Emp-Config.xml");
		System.out.println("Configuration Object Created Successfully");
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("Session Factory Object Created Successfully");
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Emp e = new Emp();
		e.setId("101");
		e.setName("Lu Yang");
		Map<Integer,PhoneNumber> l = new HashMap<>();
		PhoneNumber p1 = new PhoneNumber();
		p1.setPid("111");
		p1.setNetwork("JIO");
		p1.setPhonenumber("9933445566");
		PhoneNumber p2 = new PhoneNumber();
		p2.setPid("112");
		p2.setNetwork("AIRTEL");
		p2.setPhonenumber("9933447788");
		l.put(1, p1);
		l.put(2, p2);
		e.setPhoneno(l);
		s.save(e);
		t.commit();
		System.out.println("Successfully inserted into the Database");
		s.close();
		sf.close();
	}
}
