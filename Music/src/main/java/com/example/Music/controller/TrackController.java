package com.example.Music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Music.model.Track;
import com.example.Music.repo.TrackDal;
@CrossOrigin
@RestController
public class TrackController {
	@Autowired
	private TrackDal trkDal;
	
	@PostMapping("/tracks")
	public Track create(@RequestBody Track trak) {
		trkDal.create(trak);
		return trak;
	}
		@GetMapping("/tracks")
		public List<Track> findAll(){
			return trkDal.findAll();
		}
		@DeleteMapping(path = { "/tracks/{id}" })
		public Track delete(@PathVariable("id") int id) {
			Track deletedalb = trkDal.findById(id);
			if(trkDal.delete(deletedalb))
				return deletedalb;
			else
				return null;
		}
}
