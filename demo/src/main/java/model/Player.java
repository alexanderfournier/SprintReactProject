package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Player  {
	
	@org.springframework.data.annotation.Id
	@GeneratedValue
	private long Id;
	private String name;
	private Position position;
	
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
		
	}
	public Player(String name,Long Id) {
		this.Id = Id;
		this.name = name;
	}
	
	
	public long getId() {
		return Id;
	}



	public void setId(Long Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Position getPosition() {
		return position;
	}

	
	   @Override
	    public String toString() {
	        return "Player{" +
	                "id=" + Id +
	                ", name='" + name + '\'' +
	                '}';
	    }


	
	
	
	
	

}
