package com.journaldev.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.journaldev.model.Person;

public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	public void save(Person person) {
		Session session = this.sessionFactory.openSession();
		
		// Begin the transaction.
		Transaction transaction = session.beginTransaction();
		
		// Store the person into the Hibernate session
		session.persist(person);
		// Write the person to the Database.
		transaction.commit();
		
		// Close the session.
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Person> list() {
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		
		// Close the session.
		session.close();
		
		return personList;
	}

}
