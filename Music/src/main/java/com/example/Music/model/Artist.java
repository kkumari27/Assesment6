package com.example.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/artist")
public class Artist {
	@Id
	private int id;
	private String name;
	private String gender;
	@DBRef
	private List<Album> album;
	
	public Artist(int id, String name, String gender, List<Album> album) {
		super();
		this.name = name;
		this.gender = gender;
		this.album = album;
		this.id=id;
		
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Album> getAlbum() {
		return album;
	}
	public void setAlbum(List<Album> album) {
		this.album = album;
	}
	
	
	

}
