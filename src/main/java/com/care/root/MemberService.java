package com.care.root;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	//@Autowired
	@Inject
	@Qualifier("123")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("memberServeice");
	}
	public void test() {
		System.out.println("svr test");
		dao.test();
	}
	public MemberDTO result() {
		return dao.result();
	}
}
