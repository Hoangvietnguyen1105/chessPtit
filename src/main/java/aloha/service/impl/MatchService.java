package aloha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aloha.entity.MatchEntity;
import aloha.repository.MatchRepo;
import aloha.service.IMatchService;
@Service

public class MatchService implements IMatchService{
	@Autowired
	private MatchRepo MR;
	
	@Override
	public String addMatch(MatchEntity match) {
		MR.save(match);
		return	"done";
	}

}
