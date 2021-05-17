package com.organization.mvcproject.DAO;


import java.util.List;

import com.organization.mvcproject.models.Game;


public interface GameDAO {
	
	
	List<Game> retrieveAllGames();
	
	Game saveGame(Game game);
	
	void deleteGame(Game game); 
	
	Game findByGameId(Integer gameId);
	
	Game updateGame(Integer gameId, String name, String genre);
	
	
	}