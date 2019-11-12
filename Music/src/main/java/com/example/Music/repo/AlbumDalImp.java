package com.example.Music.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.Music.model.Album;

@Repository
public class AlbumDalImp implements AlbumDal{
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Album create(Album alb) {
		// TODO Auto-generated method stub
		return mongo.save(alb);
	}

	@Override
	public Boolean delete(Album alb) {
		// TODO Auto-generated method stub
		return mongo.remove(alb).wasAcknowledged();
	}

	@Override
	public List<Album> findAll() {
		
		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(int id) {
		return mongo.findOne(new Query(Criteria.where("id").is(id)), Album.class);
	}
}
