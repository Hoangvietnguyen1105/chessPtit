package aloha.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rounds")
public class RoundEntity {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="status")
	private String status;
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "season_id")
    private SeasonEntity season;
	@OneToMany(mappedBy="round",cascade = CascadeType.ALL)
	private List<MatchEntity>  match;
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

	public SeasonEntity getSeason() {
		return season;
	}
	public void setSeason(SeasonEntity season) {
		this.season = season;
	}
	public List<MatchEntity> getMatch() {
		return match;
	}
	public void setMatch(List<MatchEntity> match) {
		this.match = match;
	}
	
	
}
