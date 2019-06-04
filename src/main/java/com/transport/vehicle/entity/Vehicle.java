package com.transport.vehicle.entity;

public class Vehicle {
	
	private int id;
	private String name;
	private String chasis_no;
	private String vehicle_type;
	private String fuel_type;
	private String engine_no;
	private String reg_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChasis_no() {
		return chasis_no;
	}
	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", chasis_no=" + chasis_no + ", vehicle_type=" + vehicle_type
				+ ", fuel_type=" + fuel_type + ", engine_no=" + engine_no + ", reg_no=" + reg_no + "]";
	}
	
	

}
