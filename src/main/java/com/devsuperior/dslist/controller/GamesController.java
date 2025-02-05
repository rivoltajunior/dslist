package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

	@Autowired
	private GamesService gamesservice;
	
	@GetMapping
	public List<GameMinDTO> findALL(){
		List<GameMinDTO> result = gamesservice.findAll();
		
		return result;
	}
}
	
