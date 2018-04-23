package com.location;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Location;

@Service("locationBiz")
public class LocationBiz implements Biz<Location, String> {
	
	@Resource(name="locationDao")
	Dao<Location, String> dao;	
	
	@Override
	public void register(Location t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Location t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location get(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> getAll(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Location> search(HashMap<String, Object> map) {
		return ((LocationDao)dao).search(map);
	}

}
