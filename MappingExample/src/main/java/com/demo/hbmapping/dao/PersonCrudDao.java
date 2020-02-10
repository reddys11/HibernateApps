package com.demo.hbmapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hbmapping.model.Person;
@Repository
public interface PersonCrudDao extends JpaRepository<Person, Integer>{

}
