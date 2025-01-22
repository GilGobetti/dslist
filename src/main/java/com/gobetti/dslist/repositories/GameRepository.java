package com.gobetti.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gobetti.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
