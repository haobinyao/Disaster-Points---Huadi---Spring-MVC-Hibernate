package com.luv2code.springdemo.entity;

// these are standard package, not hibernate packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// 1. create entity
@Entity
@Table(name="customer")
public class Dp {

	// 2. create properties of Disaster Points 
	// set as primary key
	@Id
	// validate value
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	// set entity for DP
	@Column(name="id")
	private int id;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="altitude")
	private String altitude;
	
	@Column(name="type")
	private String type;
	
	@Column(name="hazardLevel")
	private String hazardLevel;
	
	@Column(name="comments")
	private String comments;
	
	public DP() {
		
	}

	// 2.1 add get and set functions
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHazardLevel() {
		return hazardLevel;
	}

	public void setHazardLevel(String hazardLevel) {
		this.hazardLevel = hazardLevel;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	// 2.2 add toString function
	@Override
	public String toString() {
		return "Customer [id=" + id + ", latitude=" + latitude + ", altitude=" + altitude + ", type=" + type
				+ ", hazardLevel=" + hazardLevel + ", comments=" + comments + "]";
	}	
}
