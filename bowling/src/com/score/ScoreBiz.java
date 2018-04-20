package com.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Score;

@Service("scoreBiz")
public class ScoreBiz implements Biz{

	@Resource(name="scoreDao")
	Dao<Score, String> dao;
	
	@Override
	public void register(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(Object s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List get() {
		// TODO Auto-generated method stub
		return null;
	}

}
