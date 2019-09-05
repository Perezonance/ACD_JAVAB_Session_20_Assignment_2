package hibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/*
 * 1. Create New Project
 * 2. Addign Hibernate to build path
 * 3. In the Default src: create hibernate.cfg.xml
 * 4. Add Mapping Resource File: <mapping resource = "message.hbm.xml"
 * 5. Create a mapping resource file w ith the same name
 * 6. BAsed on the mapping resource
 */
public class HibernateMain {
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		MessageNew msgNew = new MessageNew();
		msgNew.setMessageText("Annotized Hello World!");
		factory = new Configuration().configure().buildSessionFactory();
		Message message = new Message();
		message.setMessageText("Hello World!");
		Session session = factory.openSession();
		factory = new Configuration().configure().buildSessionFactory();
	
		
		//Transaction tnx = session.beginTransaction();
		session.save(msgNew);
		session.save(message);
		//tnx.commit();
		session.close();
	}
}
