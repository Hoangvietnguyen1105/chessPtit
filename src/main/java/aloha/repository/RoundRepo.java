package aloha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import aloha.entity.RoundEntity;
import aloha.entity.TournamentEntity;

public interface RoundRepo extends JpaRepository<RoundEntity, Integer>{
	List<RoundEntity> findBySeason_Tournament(TournamentEntity tour);
}
