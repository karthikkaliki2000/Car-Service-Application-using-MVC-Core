package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

/**

 1. Domain Model is already created for you, just generate getter and setter.
 2. Also,Implement the interface Vehicle and Override the method saveVehicleDetails() and createVehicle() in car.
**/
    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;
    static int count=0;
	@Override
	public Boolean saveVehicleDetails() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String WorkDone) {
		// TODO Auto-generated method stub
		this.RegisterationNumber=RegistrationNumber;
		this.CarName=CarName;
		this.CarDetails=CarDetails;
		this.CarWork=WorkDone;
		this.CarId=count++;
		
		
	}
	public String getRegisterationNumber() {
		return RegisterationNumber;
	}
	public void setRegisterationNumber(String registerationNumber) {
		RegisterationNumber = registerationNumber;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarDetails() {
		return CarDetails;
	}
	public void setCarDetails(String carDetails) {
		CarDetails = carDetails;
	}
	public String getCarWork() {
		return CarWork;
	}
	public void setCarWork(String carWork) {
		CarWork = carWork;
	}
	public Integer getCarId() {
		return CarId;
	}
	public void setCarId(Integer carId) {
		CarId = carId;
	}

}
