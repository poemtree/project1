package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.game.GameBiz;
import com.vo.Game;

@Controller
public class GameController {
	@Resource(name="gameBiz")
	Biz<Game, String> biz;
	
	@RequestMapping("openGame.do")
	public void opemGame(HttpServletResponse res, Game newGame) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out=null;
		try {
			out = res.getWriter();
			biz.register(newGame);
			out.print(biz.get(newGame.getGame_master()).toString());
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			out.println("2");
		} finally {
			out.close();
		}
	}
	
	@RequestMapping("joinGame.do")
	public void joinGame(HttpServletResponse res, String game_num) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out=null;
		try {
			out = res.getWriter();
			out.print(((GameBiz)biz).joinGame(game_num).toString());
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			out.write("2");
		} finally {
			out.close();
		}
	}
	
}
