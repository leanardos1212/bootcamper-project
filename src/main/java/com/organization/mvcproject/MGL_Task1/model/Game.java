package com.organization.mvcproject.MGL_Task1.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Game extends AbstractEntity {

	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
