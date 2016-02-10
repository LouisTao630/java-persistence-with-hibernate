package com.louis.exercise.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.louis.exercise.hibernate.data.Message;
import com.louis.exercise.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Message msg = new Message("Hello World!");
		session.save(msg);
		tx.commit();
		session.close();

		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		List<?> messages = session.createQuery("from Message m order by m.text asc").list();
		System.out.println(messages.size() + " message(s) found:");
		for (java.util.Iterator<?> it = messages.iterator(); it.hasNext();) {
			Message loadMessage = (Message) it.next();
			System.out.println(loadMessage.getText());
		}
		tx.commit();
		session.close();

		HibernateUtil.shutdown();
	}
}
