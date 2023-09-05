package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms; //new ������ ��� ���
	
	public MemberController() {
		System.out.println("memberController ����"); //��Ʈ�ѷ��� �ν��ߴ��� Ȯ�� �뵵
	}
	
	@GetMapping("/index")
	public String index() {
		ms.test();
		return "index";
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		model.addAttribute("member", ms.result() );
		return "result";
	}
}
