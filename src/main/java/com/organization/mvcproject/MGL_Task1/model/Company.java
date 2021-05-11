package com.organization.mvcproject.MGL_Task1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Company extends AbstractEntity {

	
	private List<Game> gamesMade = new ArrayList<Game>();

	public List<Game> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<Game> gamesMade) {
		this.gamesMade = gamesMade;
	}
}