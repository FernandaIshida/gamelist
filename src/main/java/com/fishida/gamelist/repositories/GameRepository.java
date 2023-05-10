package com.fishida.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fishida.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
