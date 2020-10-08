package com.cognixia.hackathon.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "driver")
public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "driver_id")
	private Integer driverId;
	
	private String name;
	private String driverLicense;
	private String carMake;
	private String carModel;
	
	public Driver(String name, String driverLicense, String carMake, String carModel) {
		super();
		this.name = name;
		this.driverLicense = driverLicense;
		this.carMake = carMake;
		this.carModel = carModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}
