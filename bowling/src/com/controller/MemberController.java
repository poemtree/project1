package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.vo.Member;

@Controller
public class MemberController {

	@Resource(name="memberBiz")
	Biz<Member, String> biz;
	
	@RequestMapping("itsMe.do")
	public void selectMember(HttpServletResponse res, String id, String pwd) {
		HashMap<String, Object> map = new HashMap<>();
		PrintWriter out=null;
		try {
			out = res.getWriter();
			map.put("id", id);
			map.put("pwd", pwd);
			System.out.printf("Call servlet %s, %S\n",id,pwd);
			Member itsMe = biz.login(map);
			System.out.printf("itsMe %s, %S\n",itsMe.getId(),itsMe.getPwd());
			out.println("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			out.println("2");
		} finally {
			out.close();
		}
		
	}
	
	@RequestMapping("registerMember.do")
	public void registerMember(HttpServletResponse res, Member newbie) {
		PrintWriter out=null;
		try {
			out = res.getWriter();
			biz.register(newbie);
			out.println("1");
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			out.println("2");
		} finally {
			out.close();
		}		
	}
	
}
