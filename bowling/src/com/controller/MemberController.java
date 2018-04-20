package com.controller;

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
	public String selectMember(Model m, String id) {
		Member itsMe = biz.get(id);
		m.addAttribute("itsMe", itsMe);
		return "myInfo";
		
	}
	
	
}
