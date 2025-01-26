package com.gobetti.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gobetti.dslist.dto.GameListDTO;
import com.gobetti.dslist.dto.GameMinDTO;
import com.gobetti.dslist.entities.GameList;
import com.gobetti.dslist.repositories.GameListRepository;

@Service

public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	
	}

}
