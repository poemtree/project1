package com.member;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Member;

@Service("memberBiz")
public class MemberBiz implements Biz<Member, String> {

	@Resource(name="memberDao")
	Dao<Member, String> dao;
	
	@Override
	public void register(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		dao.delete(s);
	}

	@Override
	public void modify(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public Member get(String s) {
		// TODO Auto-generated method stub
		return dao.select(s);
	}

	@Override
	public List<Member> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
