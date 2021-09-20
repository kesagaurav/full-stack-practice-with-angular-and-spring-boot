package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Team;
import com.gaurav.service.TeamCrud;

@RestController
public class TeamController implements TeamCrud {

	@Autowired
	private TeamCrud service;
	@PostMapping("/team")
	public Team addTeam(@RequestBody Team t) {
		// TODO Auto-generated method stub
		return service.addTeam(t);
	}
	@PutMapping("/team")
	public Team updateTeam(@RequestBody Team t) {
		// TODO Auto-generated method stub
		return service.addTeam(t);
	}
	@DeleteMapping("/team/{id}")
	public void teamDelete(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.teamDelete(id);
	}
	@GetMapping("/teams")
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return service.getAllTeams();
	}

}
