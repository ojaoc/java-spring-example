package com.ojaoc.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojaoc.spring.example.car.Car;
import com.ojaoc.spring.example.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = factory.getBean(Car.class);

		System.out.println(car.getWheels()[0].getTire().getBrand());

	}
}
