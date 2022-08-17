package com.tyss.car.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.car.dto.Car;

public class CarDao {
	public void saveCar(Car car) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("Data saved");
	}
	
	public Car getCarById(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Car car = entityManager.find(Car.class, id);
		if(car!=null) {
			System.out.println("Id is "+car.getId());
			System.out.println("Name is "+car.getName());
			System.out.println("Cost is "+car.getCost());
			System.out.println("Brand is "+car.getBrand());
		}
		else {
			System.out.println("Id is not valid");
		}
		return car;
		
	}
	
	public boolean deleteCarById(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		Car car = entityManager.find(Car.class, id);
		if(car!=null) {
			entityTransaction.begin();
			entityManager.remove(car);
			entityTransaction.commit();
			System.out.println("Data is deleted");
			return true;
		}
		else {
			System.out.println("Id is invalid");
		}
		return false;
	
		
	}

}
