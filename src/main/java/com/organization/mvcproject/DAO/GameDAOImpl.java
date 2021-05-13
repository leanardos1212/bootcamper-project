package com.organization.mvcproject.DAO;

import java.util.ArrayList;
import java.util.List;
import com.organization.mvcproject.MGL_Task1.model.Game;

public class GameDAOImpl implements GameDAO {
	
	private static Integer gameID = 0;
	
	private static List<Game> games = new ArrayList<Game>();
	
	static  {
			games = populateGames();
	}
	
	static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(gameID++);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(gameID++);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(gameID++);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}
	 
		@Override
		public List<Game> retrieveAllGames() {
			games.stream();
			return games;
		}
	
		@Override
		public Game saveGame(Game game) {
			game.setId(gameID++);
			games.add(game);
			return game;
		}
		
		
		public Game findByGameId(Integer gameId) {
			  for (Game game : games) {
			      if (game.getId() == gameId) { 
			        return game;
			   }
			}
			  return null;
		}

		@Override
		public void deleteGame(Game game) {
			games.remove(game);
		}
	
	 
}