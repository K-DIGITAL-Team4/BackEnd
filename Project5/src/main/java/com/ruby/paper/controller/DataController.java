package com.ruby.paper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.paper.domain.DrivingVO;
import com.ruby.paper.domain.TestVO;
import com.ruby.paper.domain.VehicleVO;
import com.ruby.paper.service.DataService;

@RestController
public class DataController {

	private DataService ds;
	
	@Autowired
	public DataController(DataService ds) {
		this.ds = ds;
		System.out.println("DataController() 생성자가 호출됨");
	}
	
	
	//Driving_Unit_Data 테이블의 모든 정보 출력
	@GetMapping("/drive")
	public List<DrivingVO> driveInfo(){
		System.out.println("DataController - driveInfo()호출");
		return ds.driveInfo();
	}
	
	//Vehicle_Information_Data 테이블의 모든 정보 출력
	@GetMapping("/vehicle")
	public List<VehicleVO> vehicleInfo(){
		System.out.println("DataController - vehicleInfo()호출");
		return ds.vehicleInfo();
	}
}
