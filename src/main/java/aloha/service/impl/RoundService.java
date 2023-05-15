package aloha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aloha.entity.RoundEntity;
import aloha.entity.TournamentEntity;
import aloha.repository.RoundRepo;
import aloha.repository.TournamentRepo;
import aloha.service.IRoundService;
@Service
public class RoundService implements IRoundService {
	@Autowired
	private RoundRepo RR;
	@Autowired
	private TournamentRepo TR;
	@Override
	public List<RoundEntity> findAllWhereStatus1(int teamId) {
		TournamentEntity TE = TR.findById(teamId);
		List<RoundEntity> a = RR.findBySeason_Tournament(TE);
		return a;
	}
	@Override
	public RoundEntity findById(int id) {
		RoundEntity a = RR.findOne(id);
		return a;
	}

}
