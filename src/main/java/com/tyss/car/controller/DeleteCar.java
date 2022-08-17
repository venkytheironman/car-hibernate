package com.tyss.car.controller;

import com.tyss.car.dao.CarDao;
import com.tyss.car.dto.Car;

public class DeleteCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		CarDao dao = new CarDao();
		boolean temp=dao.deleteCarById(10);
		System.out.println(temp);

	}

}
