package com.organization.mvcproject.DAO;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.organization.mvcproject.MGL_Task1.model.Game;

@Repository
public interface GameDAO {
	
	List<Game> retrieveAllGames();
	
	Game saveGame(Game game);
	
//	Long gameId;
//	
//	static {  games = populateGames(); }
	
//		 static List<Game> populateGames() {
//		 List<Game> games;
//		  Game game1 = new Game(); 
//		  game1.setGame_id(++gameId);
//		  game1.setGame_genre("Sport"); 
//		  game1.setGame_name("Rocket League");
//		  
//		  Game game2 = new Game(); 
//		  game2.setGame_id(++gameId);
//		  game2.setGame_genre("Shooter"); 
//		  game2.setGame_name("Halo 3");
//		  
//		  Game game3 = new Game(); 
//		  game3.setGame_id(++gameId);
//		  game3.setGame_genre("MMORPG"); 
//		  game3.setGame_name("Runescape");
//		  
//		  
//		  games.add(game1); 
//		  games.add(game2); 
//		  games.add(game3);
//		  
//		  return games; }
		
//		 populateGames.stream();

	 
	}