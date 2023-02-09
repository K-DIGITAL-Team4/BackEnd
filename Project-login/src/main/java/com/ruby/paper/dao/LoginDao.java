package com.ruby.paper.dao.data;

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

	public MemberVO getMember(String id) {
		String sqlString = String.format("select id, pw from Member where id = '%s'", id);
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public int addMember(MemberVO memberVO) {
		// 길고 복잡한 쿼리문 PreparedStatement 사용
//		return jdbcTemplate.update(new PreparedStatementCreator() {
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				String query = "insert into member (id, pw) value (?, ?)";
		// 파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
//				PreparedStatement pstmt = con.prepareStatement(query);
		// 인덱스 파라미터 값 설정
//				pstmt.setString(1, memberVO.getId());
//				pstmt.setString(2, memberVO.getPw());
		// 생성한 PreparedStatement 객체 리턴
//				return pstmt;
//			}
//		});

		// 짧고 단순한 쿼리문 String.format(문자열 형식 지정) 사용
		String sql = String.format("insert into Member (id, pw) value ('%s', '%s')", memberVO.getId(), memberVO.getPw());
		return jdbcTemplate.update(sql);
	}

	public int updateMember(String id, String pw) {
		String sqlString = String.format("update Member set pw = '%s' where id = '%s'", pw, id);
		int member = jdbcTemplate.update(sqlString);
		return member;
	}

	public int deleteMember(String id) {
		String sqlString = String.format("delete from Member where id = '%s'", id);
		int member = jdbcTemplate.update(sqlString);
		return member;
	}

}