package com.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
			m.addAttribute("rank_avg", 0);
			m.addAttribute("tot_avg", 0);
			m.addAttribute("strike_avg", 0);
			m.addAttribute("strike_rank", 0);
			
		} finally {
			m.addAttribute("id", id);
		}
		return "dashboard";
	}
	
	@RequestMapping("myChartImpl.do")
	@ResponseBody
	public void myChartImpl(HttpServletResponse res, String id) {
		System.out.print(id);
		res.setCharacterEncoding("UTF-8");
		res.setContentType("application/json");
		PrintWriter out=null;
		
		String url = "jdbc:oracle:thin:@70.12.114.140:1521:xe";
		String user = "bowling";
		String pass = "111111";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			JSONArray ja = new JSONArray();
			JSONArray avgAry = new JSONArray();
			JSONArray maxAry = new JSONArray();
			JSONArray minAry = new JSONArray();
			JSONObject avg = new JSONObject();
			JSONObject max = new JSONObject();
			JSONObject min = new JSONObject();
			out = res.getWriter();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement("SELECT year, ROUND(AVG(set10),2) AS avg, MAX(set10) AS max, MIN(set10) AS min FROM(SELECT TO_CHAR(TO_DATE(regdate,'yy/mm/dd'),'yy') AS year, TO_CHAR(TO_DATE(regdate,'yy/mm/dd'),'MM') AS month, TO_CHAR(TO_DATE(regdate,'yy/mm/dd'),'dd') AS day,set10, strike, spare FROM SCORE WHERE id=?) GROUP BY year ORDER BY year");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				maxAry.add(rs.getInt("max"));
				minAry.add(rs.getInt("min"));
				avgAry.add(rs.getDouble("avg"));
			}
			avg.put("name", "avg");
			max.put("name", "max");
			min.put("name", "min");
			avg.put("data", avgAry);
			max.put("data", maxAry);
			min.put("data", minAry);
			ja.add(avg);
			ja.add(max);
			ja.add(min);
			out.write(ja.toJSONString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
			try {
				if(conn!=null)
					conn.close();
				if(pstmt != null)
					pstmt.close();
				if(rs != null)
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
	
}

