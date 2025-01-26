package com.gobetti.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gobetti.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
