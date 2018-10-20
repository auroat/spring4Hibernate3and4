package com.journaldev.dao;

import java.util.List;

import com.journaldev.model.Person;

public interface PersonDAO {

	void save(Person p);
	
	List<Person> list();
	
}
