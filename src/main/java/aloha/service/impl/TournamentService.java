package aloha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aloha.entity.TournamentEntity;
import aloha.repository.TournamentRepo;
import aloha.service.ITournament;


@Service
public class TournamentService implements ITournament {
	@Autowired
	private TournamentRepo TR;
	@Override
	public List<TournamentEntity> getAll() {
		List<TournamentEntity> tours = TR.findAll();
		return tours;
	}
	
}
