package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Player;
import com.gaurav.service.PlayerCrud;

@RestController
@CrossOrigin
public class PlayerController  {

	@Autowired
	private PlayerCrud service;
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		return service.addPlayer(player);
	}

	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		return service.updatePlayer(player);
	}

	@GetMapping("/player/{id}")
	public Player getPlayerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getPlayerById(id);
	}

	@DeleteMapping("/player/{id}")
	public void deletePlayer( @PathVariable int id) {
		// TODO Auto-generated method stub
		service.deletePlayer(id);
	}

	@GetMapping("/player")
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return service.getAllPlayers();
	}

	
	
}
