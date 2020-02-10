package com.demo.hbmapping.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hbmapping.dao.PersonCrudDao;
import com.demo.hbmapping.model.Person;
import com.demo.hbmapping.service.PersonCrudService;

@Service
public class PersonCrudServiceImpl implements PersonCrudService{

	@Autowired
	public PersonCrudDao l_objPersonDao;
	@Override
	public void save(Person person) {
		l_objPersonDao.save(person);
	}

	
}
