package com.lmdlearning.webservices.restful_web_services.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@Size(min=2, message="Name should be at least 2 characters long.")
	@JsonProperty("user_name")
	private String name;
	
	@Past(message="Birth date should be in the past.")
	@JsonProperty("birth_date")
	private LocalDate birthDate;
	
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
	    return String.format("User\n{\nid=%d,\nname='%s',\nbirthDate=%s\n}", id, name, birthDate);
	}

}