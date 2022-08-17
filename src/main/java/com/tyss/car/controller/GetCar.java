package com.tyss.car.controller;

import com.tyss.car.dao.CarDao;
import com.tyss.car.dto.Car;

public class GetCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		CarDao dao = new CarDao();
          dao.getCarById(10);
	}

}
