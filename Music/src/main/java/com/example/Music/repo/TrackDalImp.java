package com.example.Music.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.Music.model.Track;

@Repository
public class TrackDalImp implements TrackDal{
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Track create(Track trk) {
		// TODO Auto-generated method stub
		return mongo.save(trk);
	}

	@Override
	public Boolean delete(Track trk) {
		// TODO Auto-generated method stub
		return mongo.remove(trk).wasAcknowledged();
	}

	@Override
	public List<Track> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track.class);
	}

	@Override
	public Track findById(int id) {
		// TODO Auto-generated method stub
		return mongo.findOne(new Query(Criteria.where("id").is(id)), Track.class);
	}

	

	

	
}
