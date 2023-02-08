package com.ruby.paper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.paper.domain.MemberVO;
import com.ruby.paper.service.LoginService;

@RestController
public class LoginController {

	private LoginService loginService;

	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@GetMapping("/signin")
	public MemberVO signin(MemberVO memberVO) {
		return loginService.getSignin();
	}

	@PostMapping("/signup")
	public MemberVO signup(MemberVO memberVO) {
		return loginService.getSignup();
	}

	@PutMapping("/edit")
	public MemberVO edit(MemberVO memberVO) {
		return loginService.getEdit();
	}

	@DeleteMapping("/remove")
	public MemberVO remove(MemberVO memberVO) {
		return loginService.getRemove();
	}

}
