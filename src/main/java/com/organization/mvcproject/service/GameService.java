package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.organization.mvcproject.DAO.GameDAO;
import com.organization.mvcproject.models.Game;

public interface GameService {
	
	List<Game> retrieveAllGames();

	Game saveGame(Game game);

}
