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
@Table(name = "players")
public class PlayerEntity {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")	//định nghĩa table name sẽ tạo ra trong mysql
	private String age;
	@Column(name="contry")
	private String contry;
	@Column(name="description")
	private String desscription;
	@Column(name="elo")
	private int elo;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
    @ManyToOne 
    @JoinColumn(name = "team_id")
    private TeamEntity team;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getDesscription() {
		return desscription;
	}
	public void setDesscription(String desscription) {
		this.desscription = desscription;
	}
	public int getElo() {
		return elo;
	}
	public void setElo(int elo) {
		this.elo = elo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TeamEntity getTeam() {
		return team;
	}
	public void setTeam(TeamEntity team) {
		this.team = team;
	}
    
}
