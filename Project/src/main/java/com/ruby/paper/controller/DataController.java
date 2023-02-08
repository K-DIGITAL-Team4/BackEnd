package com.ruby.paper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.paper.domain.DrivingVO;
import com.ruby.paper.domain.SimulVO;
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
	
<<<<<<<< HEAD:Project/src/main/java/com/ruby/paper/controller/DataController.java
<<<<<<< HEAD:Project/src/main/java/com/ruby/paper/controller/DataController.java
========
>>>>>>>> a8f8de6 (style: 코드포맷팅):Project6/src/main/java/com/ruby/paper/controller/DataController.java
	//Simul 테이블의 모든 정보 출력
	@GetMapping("/simul")
	public List<SimulVO> simulInfo(){
		System.out.println("DataController - simulInfo()호출");
		return ds.simulInfo();
<<<<<<<< HEAD:Project/src/main/java/com/ruby/paper/controller/DataController.java
=======

	//테스트 테이블의 모든 정보 출력
	@GetMapping("/test")
	public List<TestVO> testInfo(){
		System.out.println("DataController - testInfo()호출");
		return ds.testInfo();
>>>>>>> fa77e23 (feat: 백엔드 업로드):Project4/src/main/java/com/ruby/paper/controller/DataController.java
========
>>>>>>>> a8f8de6 (style: 코드포맷팅):Project6/src/main/java/com/ruby/paper/controller/DataController.java
	}
	
	//차량 번호로 정보 조회
	@GetMapping("/drive/{car_num}")
	public List<DrivingVO> getSearch(@PathVariable String car_num) {
		System.out.println("DataController - getSearch()호출");
		return ds.getSearch(car_num);
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
