package com.ojaoc.spring.example.car.components.wheel;

import org.springframework.stereotype.Component;

@Component
public class Tire {

	private String brand;

	public Tire(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

}
