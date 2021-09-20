package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Team;

public interface TeamCrud {

	Team addTeam(Team t);
	Team updateTeam(Team t);
	void teamDelete(int id);
	List<Team> getAllTeams();
	
}
