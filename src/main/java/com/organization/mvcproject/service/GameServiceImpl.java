package com.organization.mvcproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.organization.mvcproject.models.Game;


@Service("javaGameService")
public class GameServiceImpl implements GameService {

	private static Integer gameId = 0;

	private static List<Game> gamesList = new ArrayList<Game>();

	static {
		gamesList = populateGames();
	}

	private static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(++gameId);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(++gameId);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(++gameId);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		gamesList.add(game1);
		gamesList.add(game2);
		gamesList.add(game3);

		return gamesList;
	}

	@Override
	public List<Game> retrieveAllGames() {
		return gamesList;
	}

	@Override
	public Game saveGame(Game game) {
		game.setId(++gameId);
		gamesList.add(game);
		return game;
	}



}