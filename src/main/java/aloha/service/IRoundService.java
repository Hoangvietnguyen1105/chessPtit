package aloha.service;

import java.util.List;

import aloha.entity.RoundEntity;

public interface IRoundService {
	List<RoundEntity> findAllWhereStatus1(int teamId);
	RoundEntity findById(int id);
}
