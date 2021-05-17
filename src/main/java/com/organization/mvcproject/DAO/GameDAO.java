package com.organization.mvcproject.DAO;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.organization.mvcproject.models.Game;

@Repository
public interface GameDAO {
	
	
	List<Game> retrieveAllGames();
	
	Game saveGame(Game game);
	
	void deleteGame(Game game); 
	
	Game findByGameId(Integer gameId);
	
	
	}