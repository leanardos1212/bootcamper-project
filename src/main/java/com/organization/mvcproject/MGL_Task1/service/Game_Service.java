package com.organization.mvcproject.MGL_Task1.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

import com.organization.mvcproject.DAO.GameDAO;
import com.organization.mvcproject.MGL_Task1.model.Game;

public interface Game_Service {
	
	
	
	List<Game> retrieveAllGames();

	Game saveGame(Game game);

}
