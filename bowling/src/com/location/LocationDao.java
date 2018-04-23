package com.location;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Dao;
import com.mapper.LocationMapper;
import com.vo.Location;

@Service("locationDao")
public class LocationDao implements Dao<Location, String> {
	
	@Autowired
	LocationMapper mapper;
	
	@Override
	public void insert(Location t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Location t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location select(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> selectAll(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location selectLogin(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Location> search(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.select(map);
	}
	
}
