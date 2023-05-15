package aloha.entity;

import java.util.List;

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
@Entity
@Table(name = "teams")
public class TeamEntity {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="contry")
	private String contry;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL) 
    private List<PlayerEntity> players;
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
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public List<PlayerEntity> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerEntity> players) {
		this.players = players;
	}
    
	
    
}
