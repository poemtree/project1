package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.location.LocationBiz;
import com.vo.Location;

@Controller
public class LocationController {
	
	@Resource(name="locationBiz")
	Biz<Location, String> biz;
	
	@RequestMapping("location.do")
	public void location(HttpServletResponse res, Location l) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		HashMap<String, Object> map = new HashMap<>();
		map.put("lat", l.getLat());
		map.put("log", l.getLog());
		map.put("elat", l.getElat());
		map.put("slat",l.getSlat());
		map.put("elog", l.getElog());
		map.put("slog", l.getSlog());
		System.out.print(l.getElat());
		try {
			out = res.getWriter();
			List<Location> list = ((LocationBiz)biz).search(map);
			for(Location location : list)
				out.print("/"+location.getCenter_name()+"/"+location.getLat()+"/"+location.getLog());
			out.print("/"+list.size());
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			out.print("/0");
		} finally {
			out.close();
		}
	}

}
