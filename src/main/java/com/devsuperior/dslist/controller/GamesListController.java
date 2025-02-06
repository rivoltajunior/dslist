package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GamesListService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {

	@Autowired
	private GamesListService gamesListservice;
	
	@GetMapping
	public List<GameListDTO> findALL(){
		List<GameListDTO> result = gamesListservice.findAll();
		return result;
	}
}
	
