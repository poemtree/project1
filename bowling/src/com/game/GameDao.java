package com.game;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Dao;
import com.mapper.GameMapper;
import com.vo.Game;

@Service("gameDao")
public class GameDao implements Dao<Game, String>{

	@Autowired
	GameMapper mapper;
	
	@Override
	public void insert(Game t) {
		// TODO Auto-generated method stub
		mapper.insert(t);		
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		mapper.delete(s);
	}

	@Override
	public void update(Game t) {
		// TODO Auto-generated method stub
		mapper.update(t);
	}

	@Override
	public Game select(String s) {
		// TODO Auto-generated method stub
		return mapper.select(s);
	}

	@Override
	public List<Game> selectAll(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game selectLogin(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
