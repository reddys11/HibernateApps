package com.demo.hbmapping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hbmapping.model.Person;
import com.demo.hbmapping.service.PersonCrudService;

@RestController
public class PersonController {

	@Autowired
	PersonCrudService l_objPersonCrudServiceImpl;
	@PostMapping
	@RequestMapping(value="/save")
	public void insertPerson(@RequestBody Person person) {
		System.out.println("************Save Method************");
		l_objPersonCrudServiceImpl.save(person);
		
	}
	
}
