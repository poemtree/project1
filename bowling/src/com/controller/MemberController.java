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
import com.vo.Member;

@Controller
public class MemberController {

	@Resource(name="memberBiz")
	Biz<Member, String> biz;
	
	@RequestMapping("itsMe.do")
	@ResponseBody
	public void selectMember(HttpServletResponse res, String id, String pwd) {
		HashMap<String, Object> map = new HashMap<>();
		PrintWriter out=null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("id", id);
		map.put("pwd", pwd);
		System.out.printf("Call servlet %s, %S\n",id,pwd);
		Member itsMe = biz.login(map);
		System.out.printf("itsMe %s, %S\n",itsMe.getId(),itsMe.getPwd());
		if(itsMe.getId().equals("") && itsMe.getId().isEmpty()) {
			out.println("2");
		} else {
			out.println("1");
		}
		
	}
	
	@RequestMapping("registerMember.do")
	public String registerMember(Model m, Member newbie) {
		biz.register(newbie);
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", newbie.getId());
		map.put("pwd", newbie.getPwd());
		Member itsMe = biz.login(map);
		m.addAttribute("itsMe", itsMe);
		return "myInfo";
	}
	
}
