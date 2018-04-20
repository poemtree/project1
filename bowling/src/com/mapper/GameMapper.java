package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.vo.Game;

public interface GameMapper {
	public Game select(String obj);
	public void insert(Game obj);
	public void delete(String obj);
	public void update(Game obj);
}
