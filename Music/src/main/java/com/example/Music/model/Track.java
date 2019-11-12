package com.example.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/tracks")
public class Track {
@Id
private int id;
private String name;
@DBRef
private Album album;
@DBRef
private List<Artist> artist;
public Track(int id,String name, Album album, List<Artist> artist) {
	super();
	this.name = name;
	this.album = album;
	this.artist = artist;
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
public Album getAlbum() {
	return album;
}
public void setAlbum(Album album) {
	this.album = album;
}
public List<Artist> getArtist() {
	return artist;
}
public void setArtist(List<Artist> artist) {
	this.artist = artist;
}

}
