package com.fishida.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fishida.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
