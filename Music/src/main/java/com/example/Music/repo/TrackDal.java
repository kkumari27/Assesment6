package com.example.Music.repo;

import java.util.List;

import com.example.Music.model.Track;

public interface TrackDal {
	public Track create(Track trk);
	
	public Boolean delete(Track trk);
	
	public List<Track> findAll();
	
	public Track findById(int id);
}
