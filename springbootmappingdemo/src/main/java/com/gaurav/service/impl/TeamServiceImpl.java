package com.gaurav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Team;
import com.gaurav.repository.TeamRepository;
import com.gaurav.service.TeamCrud;
@Service
public class TeamServiceImpl implements TeamCrud {
	@Autowired
	private TeamRepository repository;
	
	@Override
	public Team addTeam(Team t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public Team updateTeam(Team t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public void teamDelete(int id) {
		// TODO Auto-generated method stub
		repository.findById(id);
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
