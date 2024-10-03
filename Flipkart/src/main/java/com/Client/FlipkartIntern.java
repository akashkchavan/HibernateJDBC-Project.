package com.Client;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.Entity.Product;
import com.Entity.User;

public abstract class FlipkartIntern<product> implements FlipK {
	
	public void login() {
		 
		 Configuration cfg = new Configuration();
         cfg.configure();
         SessionFactory sf= cfg.buildSessionFactory();
         Session s = sf.openSession();
         Transaction tx = s.beginTransaction();

         User u =new User();
         Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your ID:");
		 int id=sc.nextInt();
		 
		 System.out.println("Enter your Name:");
		 String n=sc.next();
		 
		 System.out.println("Enter your MobileNo:");
		 int m=sc.nextInt();
		 
		 System.out.println("Enter your Email:");
		 String e=sc.next();
		 
		 System.out.println("Enter your Pass:");
		 String p=sc.next();
		 
		 u.setUid(id);
		 u.setName(n);
		 u.setMobileNo(m);
		 u.setPass(p);
		 
		 s.save(u);
		 tx.commit();
		 s.close();
		 	 
		 
	}
       
       
	public void showproduct() {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Product p1 = session.get(Product.class, id);
		Query query = session.createQuery("from Product");
		
		java.util.List<product> l1 = query.list();
		for(product p : l1) {
			
			System.out.println(((Product) p).getPid());
			System.out.println(((Product) p).getPname());
//			System.out.println(p.getPrice());
			
		}
		
		System.out.println("Select Product Id to get product");
		Query query2 = session.createQuery("from Product where id =: x");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		query2.setParameter("x", id);
		
		java.util.List<Product> l2 = query2.list();
		for(Product pp : l2) {
			System.out.println(pp.getPid());
			System.out.println(pp.getPname());
			System.out.println(pp.getPrice());
		}
     
		
		
	}

		
	}
	
	
	
	
	


