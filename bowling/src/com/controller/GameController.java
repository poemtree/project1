package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.vo.Game;

@Controller
public class GameController {
	@Resource(name="gameBiz")
	Biz<Game, String> biz;
	
	@RequestMapping("openGame.do")
	public void opemGame(HttpServletResponse res, Model m, Game newGame) {
		PrintWriter out=null;
		try {
			out = res.getWriter();
			biz.register(newGame);
			out.write("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			out.write("2");
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
