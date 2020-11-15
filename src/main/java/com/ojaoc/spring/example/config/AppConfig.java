package com.ojaoc.spring.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojaoc.spring.example.car.Car;
import com.ojaoc.spring.example.car.components.Engine;
import com.ojaoc.spring.example.car.components.Wheel;
import com.ojaoc.spring.example.car.components.wheel.Rim;
import com.ojaoc.spring.example.car.components.wheel.Tire;

@Configuration
public class AppConfig {

	@Bean
	public Car getCar() {
		return new Car();
	}

	@Bean
	public Engine getEngine() {
		return new Engine(1000);
	}

	@Bean
	public Wheel[] getWheels() {
		Wheel[] result = new Wheel[4];
		for (int i = 0; i < result.length; i++) {
			result[i] = new Wheel();
		}
		return result;
	}

	@Bean
	public Tire getTire() {
		return new Tire("Michelin");
	}

	@Bean
	public Rim getRim() {
		return new Rim("Konig");
	}

}
