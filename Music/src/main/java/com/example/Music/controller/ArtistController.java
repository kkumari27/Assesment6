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

import com.example.Music.model.Artist;
import com.example.Music.repo.ArtistDal;
@CrossOrigin
@RestController
public class ArtistController {
	@Autowired
	private ArtistDal artDal;
	
	@PostMapping("/artists")
	public Artist create(@RequestBody Artist arts) {
		artDal.create(arts);
		return arts;
	}
		@GetMapping("/artists")
		public List<Artist> findAll(){
			return artDal.findAll();
		}
		@DeleteMapping(path = { "/artist/{id}" })
		public Artist delete(@PathVariable("id") int id) {
			Artist deletedart = artDal.findById(id);
			if(artDal.delete(deletedart))
				return deletedart;
			else
				return null;
		}
}
