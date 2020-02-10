package com.demo.hbmapping.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Person implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	@JsonProperty("FirstName")
	private String FirstName;
	@JsonProperty("LastName")
	private String LastName;
	@JsonProperty("age")
	private int age;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="personId",fetch=FetchType.LAZY)
	@JsonProperty("Hobbies")
	@JsonManagedReference
	private List<Hobbies> lstHbbies;

	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPersonId() {
		return personId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getAge() {
		return age;
	}

}
