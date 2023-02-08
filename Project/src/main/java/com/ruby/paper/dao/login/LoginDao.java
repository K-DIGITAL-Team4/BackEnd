package com.ruby.paper.dao.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ruby.paper.domain.MemberVO;

@Repository
public class LoginDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public LoginDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public MemberVO getSignin() {
		String sqlString = String.format("select * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getSignup() {
		String sqlString = String.format("insert * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getEdit() {
		String sqlString = String.format("update * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getRemove() {
		String sqlString = String.format("delete * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

}
