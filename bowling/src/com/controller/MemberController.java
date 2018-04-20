package com.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Biz;
import com.vo.Member;

@Controller
public class MemberController {

	@Resource(name="memberBiz")
	Biz<Member, String> biz;
	
	@RequestMapping("itsMe.do")
	public String selectMember(Model m, String id, String pwd) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("pwd", pwd);
		Member itsMe = biz.login(map);
		m.addAttribute("itsMe", itsMe);
		return "login";
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
