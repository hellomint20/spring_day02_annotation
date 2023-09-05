package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms; //new 연산자 대신 사용
	
	public MemberController() {
		System.out.println("memberController 실행"); //컨트롤러로 인식했는지 확인 용도
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
