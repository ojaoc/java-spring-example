package com.ojaoc.spring.example.car.components;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojaoc.spring.example.car.components.wheel.Rim;
import com.ojaoc.spring.example.car.components.wheel.Tire;

public class Wheel {

	private Tire tire;
	private Rim rim;

	public Tire getTire() {
		return this.tire;
	}

	public Rim getRim() {
		return this.rim;
	}

	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	@Autowired
	public void setRim(Rim rim) {
		this.rim = rim;
	}

}
