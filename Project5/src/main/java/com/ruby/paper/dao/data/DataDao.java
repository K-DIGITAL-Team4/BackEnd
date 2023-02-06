package com.ruby.paper.dao.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ruby.paper.domain.DrivingVO;
import com.ruby.paper.domain.TestVO;
import com.ruby.paper.domain.VehicleVO;

@Repository
public class DataDao implements DataInterface {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public DataDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		System.out.println("JDBCTemplate이용");
	}

	@Override
	public Map<String, Object> driveInfo() {
		String sqlString = "select * from Driving_Unit_Data";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<DrivingVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<DrivingVO>(DrivingVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}
	
	@Override
	public Map<String, Object> vehicleInfo() {
		String sqlString = "select * from Vehicle_Information_Data";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<VehicleVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<VehicleVO>(VehicleVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}
}