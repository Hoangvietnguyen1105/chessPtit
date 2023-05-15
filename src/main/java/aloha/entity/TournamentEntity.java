package aloha.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tournaments")
public class TournamentEntity implements Component {
	@Id	//set privamy key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id tự tăngF
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="des")
	private String des;
	@Column(name="status")
	private String status;
	@OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL) 
    private List<SeasonEntity> seasons;
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
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<SeasonEntity> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<SeasonEntity> seasons) {
		this.seasons = seasons;
	}
	
	
	
}
