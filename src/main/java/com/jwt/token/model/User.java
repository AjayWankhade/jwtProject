package com.jwt.token.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	private String userId;
	private String name;
	private String emial;
	
	public User() {
		
	}
	
	
	
	public User(String userId, String name, String emial) {
	
		this.userId = userId;
		this.name = name;
		this.emial = emial;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	
	
	
}
