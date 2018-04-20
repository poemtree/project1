package com.mapper;

import java.util.List;

import com.vo.Score;

public interface ScoreMapper {
	public Score select(String obj);
	public void insert(Score obj);
	public void delete(String obj);
	public void update(Score obj);
	public List<Score> selectall(String obj);
}
