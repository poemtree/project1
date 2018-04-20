package com.score;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Score;

@Service("scoreBiz")
public class ScoreBiz implements Biz<Score, String>{

	@Resource(name="scoreDao")
	Dao<Score, String> dao;
	
	@Override
	public void register(Score t) {
		// TODO Auto-generated method stub
		dao.insert(t);
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Score t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Score get(String s) {
		// TODO Auto-generated method stub
		return dao.select(s);
	}

	@Override
	public List getAll(String s) {
		// TODO Auto-generated method stub
		return dao.selectAll(s);
	}

	@Override
	public Score login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.selectLogin(map);
	}


}
