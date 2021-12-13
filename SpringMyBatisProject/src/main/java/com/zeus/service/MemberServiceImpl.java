package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeus.domain.Member;
import com.zeus.domain.MemberAuth;
import com.zeus.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Transactional
	@Override
	public void register(Member member) throws Exception {
		mapper.create(member);
		
		MemberAuth memberAuth = new MemberAuth();
		
		memberAuth.setUserNo(member.getUserNo());
		memberAuth.setAuth("ROLE_USER");
		
		mapper.createAuth(memberAuth);
	}

	@Override
	public Member read(int userNo) throws Exception {
		return mapper.read(userNo);
	}
	
	@Override
	public void modify(Member member) throws Exception {
		mapper.update(member);
		
		int userNo = member.getUserNo();
		
		mapper.deleteAuth(userNo);
		
		List<MemberAuth> authList = member.getAuthList();
		
		for(int i = 0; i < authList.size(); i++) {
			MemberAuth memberAuth = authList.get(i);
			
			String auth = memberAuth.getAuth();
			
			if(auth == null) {
				continue;
			}
			
			if(auth.trim().length() == 0) {
				continue;
			}
			
			memberAuth.setUserNo(userNo);
			
			mapper.createAuth(memberAuth);
		}
		
	}

	@Override
	public void remove(int userNo) throws Exception {
		mapper.deleteAuth(userNo);
		mapper.delete(userNo);
	}

	@Override
	public List<Member> list() throws Exception {
		return mapper.list();
	}

}
