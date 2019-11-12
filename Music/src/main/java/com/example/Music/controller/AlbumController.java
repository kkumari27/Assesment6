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

import com.example.Music.repo.AlbumDal;

import com.example.Music.model.Album;
@CrossOrigin
@RestController
public class AlbumController {
	@Autowired
	private AlbumDal albDal;
	
	@PostMapping("/albums")
	public Album create(@RequestBody Album albm) {
		albDal.create(albm);
		return albm;
	}
		@GetMapping("/albums")
		public List<Album> findAll(){
			return albDal.findAll();
		}
		@DeleteMapping(path = { "/albums/{id}" })
		public Album delete(@PathVariable("id") int id) {
			Album deletedalb = albDal.findById(id);
			if(albDal.delete(deletedalb))
				return deletedalb;
			else
				return null;
		}
}

