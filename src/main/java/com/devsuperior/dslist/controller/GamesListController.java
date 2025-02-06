package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GamesListService;
import com.devsuperior.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {

	@Autowired
	private GamesListService gamesListservice;
	
	@Autowired
	private GamesService gamesservice;
	
	@GetMapping
	public List<GameListDTO> findALL(){
		List<GameListDTO> result = gamesListservice.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gamesservice.findByList(listId);
		return result;
	}
}

	
