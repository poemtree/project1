package com.mapper;

import java.util.HashMap;

import com.vo.Member;

public interface MemberMapper {
	public Member select(String obj);
	public Member selectLogin(HashMap<String, Object> map);
	public void insert(Member obj);
	public void delete(String obj);
	public void update(Member obj);
}
