package com.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.vo.Score;

@Controller
public class ScoreController {
	@Resource(name="scoreBiz")
	Biz<Score, String> biz;
	
	@RequestMapping("inputScore.do")
	public void inputScroe(Model m, Score s) {
		System.out.print(s.toString());
		biz.register(s);
		HashMap<String, Object> map = new HashMap<>();
		map.put("game_num", s.getGame_num());
		map.put("id", s.getId());
		m.addAttribute("myScore", biz.login(map));
	}
	
}
