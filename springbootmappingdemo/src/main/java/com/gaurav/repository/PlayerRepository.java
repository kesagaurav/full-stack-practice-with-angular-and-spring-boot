package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
