package com.example.Music.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.Music.model.Artist;

@Repository
public class ArtistDalImp implements ArtistDal {
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Artist create(Artist art) {
		// TODO Auto-generated method stub
		return mongo.save(art);
	}

	@Override
	public Boolean delete(Artist art) {
		return mongo.remove(art).wasAcknowledged();
	}

	@Override
	public List<Artist> findAll() {
		
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist findById(int id) {
		// TODO Auto-generated method stub
		return mongo.findOne(new Query(Criteria.where("id").is(id)), Artist.class);
	}
}
