package com.organization.mvcproject.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	public AbstractEntity() {}
	
	public int getId() {
		return id;
	}
	public void setId(Integer i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
