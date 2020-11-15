package com.ojaoc.spring.example.car.components;

import com.ojaoc.spring.example.car.components.wheel.Rim;
import com.ojaoc.spring.example.car.components.wheel.Tire;

public class Wheel {

	private Tire tire;
	private Rim rim;

	public Tire getTire() {
		return this.tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void setRim(Rim rim) {
		this.rim = rim;
	}

	public Rim getRim() {
		return this.rim;
	}

}
