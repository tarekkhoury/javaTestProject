package com.aicube.JavaTestProject;

public class Device {

	// constructor
	public Device() {
		deviceName = "device1";
		deviceType = "arduino uno";
	}
	
	public Device(String name, String type) {
		deviceName = name;
		deviceType = type;
	}
	
	
	private String deviceType;	
	private String deviceName;	
	
	public String getDeviceName() {
		
		return this.deviceName;
	}
	
	
	public  void setDeviceName(String deviceName) {
		this.deviceName =deviceName;
		
	}
	
	
	public String getDeviceType() {
		
		return this.deviceType;
	}
	
	
	public  void setDeviceTyp(String deviceType) {
		this.deviceType =deviceType;
		
	}
	
	
	
}
