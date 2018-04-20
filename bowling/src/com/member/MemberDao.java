package com.member;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Dao;
import com.mapper.MemberMapper;
import com.vo.Member;

@Service("memberDao")
public class MemberDao implements Dao<Member, String>{
	
	@Autowired
	MemberMapper mapper;
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		mapper.insert(m);
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		mapper.delete(s);		
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		mapper.update(m);
	}

	@Override
	public Member select(String s) {
		// TODO Auto-generated method stub
		return mapper.select(s);
	}

	@Override
	public List<Member> selectAll(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Member selectLogin(HashMap<String, Object> map) {
		return mapper.selectLogin(map);
	}

}
