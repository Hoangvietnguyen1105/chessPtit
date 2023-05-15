package aloha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import aloha.entity.MatchEntity;
import aloha.entity.RoundEntity;
import aloha.entity.TournamentEntity;

public interface MatchRepo extends JpaRepository<MatchEntity, Integer>{
	
}
