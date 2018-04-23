package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.vo.Score;

public interface ScoreMapper {
	public Score select(String obj);
	public void insert(Score obj);
	public void delete(String obj);
	public void update(Score obj);
	public List<Score> selectall(String obj);
	public Score selectLogin(HashMap<String, Object> map);
	public HashMap<String, Object> rankAvg(String obj);
	public HashMap<String, Object> rankStrike(String obj);
}
