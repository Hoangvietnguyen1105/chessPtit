package aloha.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import aloha.entity.MatchEntity;
import aloha.entity.SeasonEntity;
import aloha.entity.TournamentEntity;

public class RoundDto {

	private int id;
	private String name;
	private String status;
	
	
    private int seasonId;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getSeasonId() {
		return seasonId;
	}


	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}
	
	
}
