package com.example.Music.repo;

import java.util.List;

import com.example.Music.model.Artist;

public interface ArtistDal {
	public Artist create(Artist art);
	
	public Boolean delete(Artist art);
	
	public List<Artist> findAll();
	
	public Artist findById(int id);
}
