package aloha.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "seasons")
public class SeasonEntity implements Component {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="name")
	private String name;
	@Column(name = "start")
    @Temporal(TemporalType.DATE)
    private Date start;
	@Column(name = "end")
    @Temporal(TemporalType.DATE)
    private Date end;
	@Column(name="status")
	private String status;
	@JsonIgnore
	@ManyToOne 
    @JoinColumn(name = "tournament_id")
    private TournamentEntity tournament;
	@OneToMany(mappedBy = "season", cascade = CascadeType.ALL) 
    private List<RoundEntity> round;
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
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TournamentEntity getTournament() {
		return tournament;
	}
	public void setTournament(TournamentEntity tournament) {
		this.tournament = tournament;
	}
	public List<RoundEntity> getRound() {
		return round;
	}
	public void setRound(List<RoundEntity> round) {
		this.round = round;
	}
	

}
