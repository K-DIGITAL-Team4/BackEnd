package com.ruby.paper.domain;

import java.math.BigInteger;

public class TestVO {

	private int R_id; // PK
	private BigInteger information_date; //날짜 정보
	private int date;	//운행 일자
	private String model_name; // 운행 기록기 모델
	private int car_type;	//자동차 분류
	private String car_num;	//자동차 번호
	private BigInteger business_num;	//사업자 등록 번호
	private int driver_code;	//운전자 번호
	private int daily_distance;	//일일 주행 거리
	private int cum_distance;	//누적 주행 거리
	private int car_speed;	//자동차 속도
	private int RPM;		//분당 엔진 회전수
	private int brake_signal;	//브레이크 신호
	private double car_location_GPS_X;	//GPS X좌표
	private double car_location_GPS_Y;	//GPS Y좌표
	private double Global_Positioning_System_GPS_azimuth;	//GPS 방위각
	private double accelerationVx;	//가속도 벡터 X
	private double accelerationVy;	//가속도 벡터 Y
	private int status_code;  	//통신 상태 코드
	private double RPMS;	//급격한 RPM 변화
	private double ACC;	//초당 가속도
	private int FS;	//과속
	private double RPMSR;	//급격한 RPM 변화
	private int ACCR;	//급격한 속도 변화
	private int SRA;	//RPMSR + ACCR
	
	public TestVO() {
		super();
	}

	public TestVO(int r_id, BigInteger information_date, int date, String model_name, int car_type, String car_num,
			BigInteger business_num, int driver_code, int daily_distance, int cum_distance, int car_speed, int rPM,
			int brake_signal, double car_location_GPS_X, double car_location_GPS_Y,
			double global_Positioning_System_GPS_azimuth, double accelerationVx, double accelerationVy, int status_code,
			double rPMS, double aCC, int fS, double rPMSR, int aCCR, int sRA) {
		super();
		R_id = r_id;
		this.information_date = information_date;
		this.date = date;
		this.model_name = model_name;
		this.car_type = car_type;
		this.car_num = car_num;
		this.business_num = business_num;
		this.driver_code = driver_code;
		this.daily_distance = daily_distance;
		this.cum_distance = cum_distance;
		this.car_speed = car_speed;
		RPM = rPM;
		this.brake_signal = brake_signal;
		this.car_location_GPS_X = car_location_GPS_X;
		this.car_location_GPS_Y = car_location_GPS_Y;
		Global_Positioning_System_GPS_azimuth = global_Positioning_System_GPS_azimuth;
		this.accelerationVx = accelerationVx;
		this.accelerationVy = accelerationVy;
		this.status_code = status_code;
		RPMS = rPMS;
		ACC = aCC;
		FS = fS;
		RPMSR = rPMSR;
		ACCR = aCCR;
		SRA = sRA;
	}

	public int getR_id() {
		return R_id;
	}

	public void setR_id(int r_id) {
		R_id = r_id;
	}

	public BigInteger getInformation_date() {
		return information_date;
	}

	public void setInformation_date(BigInteger information_date) {
		this.information_date = information_date;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getCar_type() {
		return car_type;
	}

	public void setCar_type(int car_type) {
		this.car_type = car_type;
	}

	public String getCar_num() {
		return car_num;
	}

	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}

	public BigInteger getBusiness_num() {
		return business_num;
	}

	public void setBusiness_num(BigInteger business_num) {
		this.business_num = business_num;
	}

	public int getDriver_code() {
		return driver_code;
	}

	public void setDriver_code(int driver_code) {
		this.driver_code = driver_code;
	}

	public int getDaily_distance() {
		return daily_distance;
	}

	public void setDaily_distance(int daily_distance) {
		this.daily_distance = daily_distance;
	}

	public int getCum_distance() {
		return cum_distance;
	}

	public void setCum_distance(int cum_distance) {
		this.cum_distance = cum_distance;
	}

	public int getCar_speed() {
		return car_speed;
	}

	public void setCar_speed(int car_speed) {
		this.car_speed = car_speed;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}

	public int getBrake_signal() {
		return brake_signal;
	}

	public void setBrake_signal(int brake_signal) {
		this.brake_signal = brake_signal;
	}

	public double getCar_location_GPS_X() {
		return car_location_GPS_X;
	}

	public void setCar_location_GPS_X(double car_location_GPS_X) {
		this.car_location_GPS_X = car_location_GPS_X;
	}

	public double getCar_location_GPS_Y() {
		return car_location_GPS_Y;
	}

	public void setCar_location_GPS_Y(double car_location_GPS_Y) {
		this.car_location_GPS_Y = car_location_GPS_Y;
	}

	public double getGlobal_Positioning_System_GPS_azimuth() {
		return Global_Positioning_System_GPS_azimuth;
	}

	public void setGlobal_Positioning_System_GPS_azimuth(double global_Positioning_System_GPS_azimuth) {
		Global_Positioning_System_GPS_azimuth = global_Positioning_System_GPS_azimuth;
	}

	public double getAccelerationVx() {
		return accelerationVx;
	}

	public void setAccelerationVx(double accelerationVx) {
		this.accelerationVx = accelerationVx;
	}

	public double getAccelerationVy() {
		return accelerationVy;
	}

	public void setAccelerationVy(double accelerationVy) {
		this.accelerationVy = accelerationVy;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public double getRPMS() {
		return RPMS;
	}

	public void setRPMS(double rPMS) {
		RPMS = rPMS;
	}

	public double getACC() {
		return ACC;
	}

	public void setACC(double aCC) {
		ACC = aCC;
	}

	public int getFS() {
		return FS;
	}

	public void setFS(int fS) {
		FS = fS;
	}

	public double getRPMSR() {
		return RPMSR;
	}

	public void setRPMSR(double rPMSR) {
		RPMSR = rPMSR;
	}

	public int getACCR() {
		return ACCR;
	}

	public void setACCR(int aCCR) {
		ACCR = aCCR;
	}

	public int getSRA() {
		return SRA;
	}

	public void setSRA(int sRA) {
		SRA = sRA;
	}

	@Override
	public String toString() {
		return "TestVO [R_id=" + R_id + ", information_date=" + information_date + ", date=" + date + ", model_name="
				+ model_name + ", car_type=" + car_type + ", car_num=" + car_num + ", business_num=" + business_num
				+ ", driver_code=" + driver_code + ", daily_distance=" + daily_distance + ", cum_distance="
				+ cum_distance + ", car_speed=" + car_speed + ", RPM=" + RPM + ", brake_signal=" + brake_signal
				+ ", car_location_GPS_X=" + car_location_GPS_X + ", car_location_GPS_Y=" + car_location_GPS_Y
				+ ", Global_Positioning_System_GPS_azimuth=" + Global_Positioning_System_GPS_azimuth
				+ ", accelerationVx=" + accelerationVx + ", accelerationVy=" + accelerationVy + ", status_code="
				+ status_code + ", RPMS=" + RPMS + ", ACC=" + ACC + ", FS=" + FS + ", RPMSR=" + RPMSR + ", ACCR=" + ACCR
				+ ", SRA=" + SRA + "]";
	}


}
