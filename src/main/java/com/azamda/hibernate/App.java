package com.azamda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();//Configuration xml file getting read by Configuration class
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		//Create operation
//		Product product = new Product();
//		product.setId(101);
//		product.setName("iPhone");
//		product.setPrice(10.0);
//		
//		session.save(product);
//		
//		session.beginTransaction().commit();
		//note: by default auto commit is disabled, so for write operations we have to tell transaction
		//to commit the data.
		
		//Read Operation
//		Product product = session.get(Product.class, 101);//select* from product where id = 101
//		System.out.println(product);
		
		//Update Operation
//		Product product = session.get(Product.class, 101);
//		product.setPrice(20.0);
//		session.saveOrUpdate(product);
//		session.beginTransaction().commit();
		
		//Delete Operation
		// Product product = session.get(Product.class, 101);
        // session.remove(product);
        // session.beginTransaction().commit();
        
		//select* from product; this is sql query
		//Hibernate Query Language(HQL) select statement is optional
		// from Entity class name is compulsory
		//where condition is optional
		//Steps to follow for hibernate query
		//Step 1. Create Query object
		// Query query = session.createQuery("from Product");
		// //step 2. process the query and get the result
		// List<Product> listOfProducts=query.list();//this method called only when you get more than one result
		// for (Product product : listOfProducts) {
		// 	System.out.println(product);
		// }
		// Query<Product> query = session.createQuery("from Product where id=101");
		// Query<Product> query = session.createQuery("from Product where id=:productId");
		// Product pr=query.uniqueResult();
		// System.out.println(pr);
		Transaction transaction=session.beginTransaction();
		Query<Product> query = session.createQuery("update Product set price=:price where id=:productId");
		query.setParameter("price", 39000.0);
		query.setParameter("productId", 101);
		int row = query.executeUpdate();
		System.out.println(row+" row updated");
		transaction.commit();
		//Note: with session we can perform only one single object at a time
		//also query is faster than Hibernate
        session.close();
        sf.close();
        System.out.println("done");
        
	}
}
