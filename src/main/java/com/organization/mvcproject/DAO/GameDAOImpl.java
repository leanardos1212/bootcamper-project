package com.organization.mvcproject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.organization.mvcproject.models.Game;

@Repository
public class GameDAOImpl implements GameDAO {
	
	private static Integer gameId = 0;
	
	private static List<Game> gamesList = new ArrayList<Game>();
	
	static  {
			gamesList = populateGames();
	}
	
	static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(gameId++);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(gameId++);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(gameId++);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		gamesList.add(game1);
		gamesList.add(game2);
		gamesList.add(game3);

		return gamesList;
	}
	 
		@Override
		public List<Game> retrieveAllGames() {
			gamesList.stream();
			return gamesList;
		}
	
		@Override
		public Game saveGame(Game game) {
			game.setId(gameId++);
			gamesList.add(game);
			return game;
		}
		
		
//		public Game findByGameId(Integer gameId) {
//			  for (Game game : gamesList) {
//			      if (game.getId() == gameId) { 
//			        return game;
//			   }
//			}
//			  return null;
//		}
		
		public Game findByGameId(Integer gameId) {
			Game foundGame;
			foundGame = gamesList.stream()
					.filter(game -> gameId.equals(game.getId()))
					.findAny()
					.orElse(null);
			return foundGame;
		}
		
		public Game updateGame(Integer gameId, String name, String genre) {
			Game updatedGame = new Game();
			for (Game game : gamesList) {
				if (game.getId() == gameId) {
					updatedGame = game;
				}
			}
			updatedGame.setGenre(genre);
			updatedGame.setName(name);
			return updatedGame;
		}

		@Override
		public void deleteGame(Game game) {
			gamesList.remove(game);
		}
	
	 
}