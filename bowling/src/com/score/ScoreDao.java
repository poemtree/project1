package com.score;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Dao;
import com.mapper.ScoreMapper;
import com.vo.Score;

@Service("scoreDao")
public class ScoreDao implements Dao<Score, String>{
	
	@Autowired
	ScoreMapper mapper;

	@Override
	public void insert(Score t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Score t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Score select(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> select() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
