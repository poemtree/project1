package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.vo.Score;

@Controller
public class ScoreController {
	@Resource(name="scoreBiz")
	Biz<Score, String> biz;
	
	@RequestMapping("inputScore.do")
	public void inputScroe(HttpServletResponse res, Score s) {
		PrintWriter out = null;
		try {
			out = res.getWriter();
			biz.register(s);
			out.print("1");	
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		} catch (Exception e) {
			out.print("2");
		} finally {
			out.close();
		}		
	}
	
}
