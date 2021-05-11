package com.organization.mvcproject.DAO;

import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.MGL_Task1.model.Game;

public class GameDAOImpl implements GameDAO {
	 
	 private static Long gameId = new Long(0); 
	 
	 private static Long companyId = new Long(0);
	 
	 private static List<Game> games = new ArrayList<Game>();
	 
	 static { 
		 
		 games = populateGames(); 
		 
				 }
	 
}