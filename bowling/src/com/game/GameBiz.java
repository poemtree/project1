package com.game;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Game;

@Service("gameBiz")
public class GameBiz implements Biz<Game, String>{

	@Resource(name="gameDao")
	Dao<Game, String> dao;
	
	@Override
	public void register(Game t) {
		// TODO Auto-generated method stub
		dao.insert(t);
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		dao.delete(s);
	}

	@Override
	public void modify(Game t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

	@Override
	public Game get(String s) {
		// TODO Auto-generated method stub
		return dao.select(s);
	}

	@Override
	public List<Game> getAll(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
