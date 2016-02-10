package com.louis.exercise.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.louis.exercise.hibernate.data.Message;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session= HibernateUtil.getSessionFactory().openSession();
       Transaction tx = session.beginTransaction();
       Message msg = new Message("Hello World!");
       session.save(msg);
       tx.commit();
       session.close();
       
       HibernateUtil.shutdown();
    }
}
