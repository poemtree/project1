package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frame.Biz;
import com.score.ScoreBiz;
import com.vo.Game;
import com.vo.Score;

@Controller
public class DashController {
	
	@Resource(name="gameBiz")
	Biz<Game, String> gBiz;
	
	@Resource(name="scoreBiz")
	Biz<Score, String> sBiz;
	
	@RequestMapping("dashBoard.do")
	public String dashBoard(Model m, String id) {
		HashMap<String, Object> map = null;
		try {
			map = ((ScoreBiz)sBiz).rankAvg(id);
			m.addAttribute("rank_avg", map.get("RANK_AVG"));
			m.addAttribute("tot_avg", map.get("TOT_AVG"));
			
			map = ((ScoreBiz)sBiz).rankStrike(id);
			m.addAttribute("strike_avg", map.get("STRIKE_AVG"));
			m.addAttribute("strike_rank", map.get("STRIKE_RANK"));
		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("rank_avg", "");
			m.addAttribute("tot_avg", "");
			m.addAttribute("strike_avg", "");
			m.addAttribute("strike_rank", "");
		}
		return "dashboard";
	}
	
	@RequestMapping("myChartImpl.do")
	@ResponseBody
	public void myChartImpl(HttpServletResponse res) {
		res.setContentType("application/json");
		PrintWriter out=null;
		try {
			out = res.getWriter();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
		
	}
	
}
