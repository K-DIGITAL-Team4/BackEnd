package com.ruby.paper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.paper.domain.MemberVO;
import com.ruby.paper.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/read/{id}") // Read , 로그인
	public MemberVO getUser(@PathVariable String id) {
		return loginService.getMember(id);
	}

	@PostMapping("/create") // Create , 회원가입
	public int addUser(MemberVO userVO) {
		return loginService.addMember(userVO);
	}

	@PutMapping("/update/{id}") // Update , 비밀번호변경
	public int updateUser(@PathVariable String id, String pw) {
		return loginService.updateMember(id, pw);
	}

	@DeleteMapping("/delete/{id}") // Delete , 아이디 삭제
	public int deleteUser(@PathVariable String id) {
		return loginService.deleteMember(id);
	}

}