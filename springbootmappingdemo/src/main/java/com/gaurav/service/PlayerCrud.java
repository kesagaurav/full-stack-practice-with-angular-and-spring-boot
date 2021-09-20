package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Player;

public interface PlayerCrud {

	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
}
