package com.ojaoc.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojaoc.spring.example.car.Car;
import com.ojaoc.spring.example.car.components.Wheel;
import com.ojaoc.spring.example.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = factory.getBean(Car.class);

		Wheel[] wheels = car.getWheels();

		for (int i = 0; i < wheels.length; i++) {
			System.out.println(car.getWheels()[i].getTire().getBrand());
			System.out.println(car.getWheels()[i].getRim().getBrand());
		}
		
		((ConfigurableApplicationContext)factory).close();

	}
}
