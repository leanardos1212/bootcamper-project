package com.organization.mvcproject.DAO;


import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.MGL_Task1.model.Game;


public interface GameDAO {
	
	
	List<Game> retrieveAllGames();
	
	Game saveGame(Game game);
	
	void deleteGame(Game game); 
	
	Game findByGameId(Integer gameId);
	
	
	}