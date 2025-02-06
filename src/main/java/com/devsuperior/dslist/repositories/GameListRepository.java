package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GamesList;

public interface GameListRepository extends JpaRepository<GamesList, Long>{

}
