package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
