package com.score;

import java.util.HashMap;
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
		return mapper.select(s);
	}

	@Override
	public List<Score> selectAll(String s) {
		// TODO Auto-generated method stub
		return mapper.selectall(s);
	}
	
	@Override
	public Score selectLogin(HashMap<String, Object> map) {
		return mapper.selectLogin(map);
	}
	
	public HashMap<String, Object> rankAvg(String s) {
		return mapper.rankAvg(s);
	}
	
	public HashMap<String, Object> rankStrike(String s) {
		return mapper.rankStrike(s);
	}
}
