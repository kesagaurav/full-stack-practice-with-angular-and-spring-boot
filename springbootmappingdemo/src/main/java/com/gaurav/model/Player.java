package com.gaurav.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Player {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String city;
	private String gender;
	@Lob
	@Column(columnDefinition = "CLOB")
	private String avatar;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="team_fk")
	private Team team;


	
}
