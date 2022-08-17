package com.tyss.car.controller;

import com.tyss.car.dao.CarDao;
import com.tyss.car.dto.Car;

public class SaveCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
        c1.setId(5);
        c1.setName("City");
        c1.setCost(10004);
        c1.setBrand("Honda");
        CarDao d1 = new CarDao();
        d1.saveCar(c1);
	}

}
