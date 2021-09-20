package com.gaurav.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Team {
	@Id
	@GeneratedValue
	private int teamId;
	private String teamName;

	
}
