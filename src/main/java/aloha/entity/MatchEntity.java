package aloha.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "matchs")
public class MatchEntity implements Component{
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	private String name;
	@Column(name = "start")
    private Date start;
	@Column(name = "end")
	private Date end;
	@Column(name="status")
	private String status;
	@Column(name = "result")
	private String result;
	@ManyToOne
	@JoinColumn(name = "player1_id")
	private PlayerEntity player1;
	@ManyToOne
    @JoinColumn(name = "player2_id")
	private PlayerEntity player2;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="round_id")
	private RoundEntity round;
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public PlayerEntity getPlayer1() {
		return player1;
	}
	public void setPlayer1(PlayerEntity player1) {
		this.player1 = player1;
	}
	public PlayerEntity getPlayer2() {
		return player2;
	}
	public void setPlayer2(PlayerEntity player2) {
		this.player2 = player2;
	}
	public RoundEntity getRound() {
		return round;
	}
	public void setRound(RoundEntity round) {
		this.round = round;
	}
	
	

}
