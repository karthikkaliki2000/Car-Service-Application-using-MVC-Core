package com.example.CarService.repository;

import com.example.CarService.domain.Car;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 1. The List for adding car is already created for you.
 2. Implement the interface DAO and override the method save() in CarDAO.
*/
@Repository
public class CarDAO implements DAO<Car>{
    private List<Car> carList= new ArrayList<>();

	@Override
	public int save(Car car) {
		// TODO Auto-generated method stub
		carList.add(car);
		car.setCarId(carList.size());
		return carList.size();
	}


}
