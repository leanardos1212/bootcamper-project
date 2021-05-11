package com.organization.mvcproject.DAO;

import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.MGL_Task1.model.Game;

public class GameDAOImpl implements GameDAO {
	 
	 private static Long gameId = new Long(0); 
	 
	 private static Long companyId = new Long(0);
	 
	 private static List<Game> games = new ArrayList<Game>();
	 
	 
	
	 @Override
		public List<Game> retrieveAllGames() {
			return games;
		}
	
		@Override
		public Game saveGame(Game game) {
			game.setId(++gameId);
			games.add(game);
			return game;
		}
	
		public static Long getGameId() {
			return gameId;
		}
	
		public static void setGameId(Long gameId) {
			GameDAOImpl.gameId = gameId;
		}
	
		public static Long getCompanyId() {
			return companyId;
		}
	
		public static void setCompanyId(Long companyId) {
			GameDAOImpl.companyId = companyId;
		}
	
		public static List<Game> getGames() {
			return games;
		}
	
		public static void setGames(ArrayList<Game> games) {
			GameDAOImpl.games = games;
		}
	
	 
}