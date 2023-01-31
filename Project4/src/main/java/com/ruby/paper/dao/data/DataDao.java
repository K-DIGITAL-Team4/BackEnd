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

//	@Override
//	public Map<String, Object> getSearch(String car_num) {
//		Map<String, Object> ret = new HashMap<>();
//		String sqlString = String.format("select * from car where car_num=%s", car_num);
//		ret.put("sql", sqlString);
//		try {
//			DataVO d = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<DataVO>(DataVO.class));
//			ret.put("data", d);
//		} catch (Exception e) {
//			ret.put("data", null);
//		}
//		return ret;
//	}

	@Override
	public Map<String, Object> testInfo() {
		String sqlString = "select * from test2";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<TestVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<TestVO>(TestVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
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