package aloha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aloha.entity.TournamentEntity;

public interface TournamentRepo extends JpaRepository<TournamentEntity,Integer >{
	TournamentEntity findById(int id);
}
