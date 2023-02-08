package com.ruby.paper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruby.paper.dao.login.LoginDao;
import com.ruby.paper.domain.MemberVO;

@Service
public class LoginService {

	private LoginDao dao;

	@Autowired
	public LoginService(LoginDao dao) {
		super();
		this.dao = dao;
	}

	public MemberVO getSignin() {
		return dao.getSignin();
	}

	public MemberVO getSignup() {
		return dao.getSignup();
	}

	public MemberVO getEdit() {
		return dao.getEdit();
	}

	public MemberVO getRemove() {
		return dao.getRemove();
	}

}