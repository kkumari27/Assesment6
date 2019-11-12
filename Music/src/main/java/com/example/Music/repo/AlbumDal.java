package com.example.Music.repo;

import java.util.List;

import com.example.Music.model.Album;

public interface AlbumDal {
	public Album create(Album alb);
	
	public Boolean delete(Album alb);
	
	public List<Album> findAll();
	
	public Album findById(int id);
}
