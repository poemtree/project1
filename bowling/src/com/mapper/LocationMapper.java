package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.vo.Location;

public interface LocationMapper {
	public List<Location> select(HashMap<String, Object> map);
}
