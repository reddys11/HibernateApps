package com.demo.hbmapping.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Hobbies implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int hobbyId;
@JsonProperty("hoby")
private String hoby;
@ManyToOne(fetch = FetchType.EAGER)
@JsonBackReference
@JsonProperty("personId")
@JoinColumn(name="personId",referencedColumnName="personId")
private Person personId;

//this constructor is important to hobbies class data will not be pushed from person.
public Hobbies(String hoby) {
	this.hoby = hoby;
}
public void setId(int hobbyId) {
	hobbyId = hobbyId;
}
public void setHoby(String hoby) {
	this.hoby = hoby;
}
public void setPersonId(Person personId) {
	this.personId = personId;
}
public int getId() {
	return hobbyId;
}
public String getHoby() {
	return hoby;
}
public Person getPersonId() {
	return personId;
}

}
