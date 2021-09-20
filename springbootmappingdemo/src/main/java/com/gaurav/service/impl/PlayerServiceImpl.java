package com.gaurav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Player;
import com.gaurav.repository.PlayerRepository;
import com.gaurav.service.PlayerCrud;
@Service
public class PlayerServiceImpl implements PlayerCrud {
	@Autowired
	private PlayerRepository repository;
	
	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
