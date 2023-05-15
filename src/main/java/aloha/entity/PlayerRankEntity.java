package aloha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "playerRanks")
public class PlayerRankEntity {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="gameWin")
	private int gameWin;
	@Column(name="gameLost")
	private int gamelost;
	@Column(name="gameDraw")
	private int gameDraw;
	@Column(name="poin")
	private int poin;
	@Column(name="status")
	private String status;
	@ManyToOne 
    @JoinColumn(name = "round_id")
	private RoundEntity round;
	@ManyToOne 
    @JoinColumn(name = "player_id")
    private PlayerEntity player;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameWin() {
		return gameWin;
	}
	public void setGameWin(int gameWin) {
		this.gameWin = gameWin;
	}
	public int getGamelost() {
		return gamelost;
	}
	public void setGamelost(int gamelost) {
		this.gamelost = gamelost;
	}
	public int getGameDraw() {
		return gameDraw;
	}
	public void setGameDraw(int gameDraw) {
		this.gameDraw = gameDraw;
	}
	public int getPoin() {
		return poin;
	}
	public void setPoin() {
		this.poin = this.gameWin*3 + this.gameDraw - this.gamelost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
