package com.mapper;

import com.vo.Member;

public interface MemberMapper {
	public Member select(String obj);
	public void insert(Member obj);
	public void delete(String obj);
	public void update(Member obj);
}
