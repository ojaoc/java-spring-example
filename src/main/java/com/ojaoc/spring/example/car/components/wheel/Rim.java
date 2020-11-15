package com.ojaoc.spring.example.car.components.wheel;

import org.springframework.stereotype.Component;

@Component
public class Rim {

	private String brand;

	public Rim(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}
}
