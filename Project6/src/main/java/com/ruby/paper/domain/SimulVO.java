package com.ruby.paper.domain;

public class SimulVO {

	private int S_id;
	private double car_location_GPS_X;
	private double car_location_GPS_Y;
	private int SRA;

	public SimulVO() {
		super();

	}

	public SimulVO(int s_id, double car_location_GPS_X, double car_location_GPS_Y, int sRA) {
		super();
		S_id = s_id;
		this.car_location_GPS_X = car_location_GPS_X;
		this.car_location_GPS_Y = car_location_GPS_Y;
		SRA = sRA;
	}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
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

	public int getSRA() {
		return SRA;
	}

	public void setSRA(int sRA) {
		SRA = sRA;
	}

	@Override
	public String toString() {
		return "SimulVO [S_id=" + S_id + ", car_location_GPS_X=" + car_location_GPS_X + ", car_location_GPS_Y="
				+ car_location_GPS_Y + ", SRA=" + SRA + "]";
	}	
	
}