package com.ruby.paper.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruby.paper.dao.data.DataInterface;
import com.ruby.paper.domain.DrivingVO;
import com.ruby.paper.domain.TestVO;
import com.ruby.paper.domain.VehicleVO;

@Service
public class DataService {

	private DataInterface dao;

	@Autowired
	public DataService(DataInterface dao) {
		this.dao = dao;
}
	
//	public DataVO getSearch(String car_num) {
//		Map<String, Object> map = dao.getSearch(car_num);
//		DataVO d = (DataVO) map.get("data");
//		return d;
//	}
	
	public List<TestVO> testInfo(){
		Map<String, Object> map = dao.testInfo();
		List<TestVO> list = (List<TestVO>) map.get("data");
		return list;
	}
	
	public List<DrivingVO> driveInfo(){
		Map<String, Object> map = dao.driveInfo();
		List<DrivingVO> list = (List<DrivingVO>) map.get("data");
		return list;
	}
	
	public List<VehicleVO> vehicleInfo(){
		Map<String, Object> map = dao.vehicleInfo();
		List<VehicleVO> list = (List<VehicleVO>) map.get("data");
		return list;
	}
}
