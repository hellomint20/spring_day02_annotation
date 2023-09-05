package com.care.root;

import org.springframework.stereotype.Repository;

@Repository()
public class MemberDAO {
	public MemberDAO() {
		System.out.println("memberDao ");
	}
	public void test() {
		System.out.println("dao test");
	}
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaa");
		dto.setName("ø°¿Ã");
		return dto;
	}
}
