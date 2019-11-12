package com.example.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="/albums")
public class Album {

	@Id
	private int id;
	private String name;
	@DBRef
	 private List<Artist> artist;
	@DBRef
	private List<Track> track;
	
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

	public List<Artist> getArtist() {
		return artist;
	}

	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}

	public Album(int id,String name, List<Artist> artist, List<Track> track) {
		super();
		this.name = name;
		this.artist = artist;
		this.track = track;
		this.id=id;
	}

	public Album() {
		
	}
	
	
	
	

}
