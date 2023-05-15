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
@Table(name = "rewards")
public class RewardEntity {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="reward")
	private String reward;
	@ManyToOne 
    @JoinColumn(name = "player_id")
    private PlayerEntity player;
	@ManyToOne 
    @JoinColumn(name = "round_id")
    private RoundEntity round;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public PlayerEntity getPlayer() {
		return player;
	}
	public void setPlayer(PlayerEntity player) {
		this.player = player;
	}
	public RoundEntity getRound() {
		return round;
	}
	public void setRound(RoundEntity round) {
		this.round = round;
	}
	
}

