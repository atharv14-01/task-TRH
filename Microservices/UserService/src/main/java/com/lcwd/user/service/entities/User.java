package com.lcwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "micro_users")
public class User {
	
	@Id
	@Column(name="u_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int u_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="about")
	private String about;
	
	@Transient
	private List<Rating>ratings = new ArrayList<>();

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public User() {
		super();
	}

	public User(int u_id, String name, String email, String about) {
		super();
		this.u_id = u_id;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", name=" + name + ", email=" + email + ", about=" + about + "]";
	}


	
}
 