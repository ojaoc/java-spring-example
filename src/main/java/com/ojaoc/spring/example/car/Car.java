package com.ojaoc.spring.example.car;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojaoc.spring.example.car.components.Engine;
import com.ojaoc.spring.example.car.components.Wheel;
import com.ojaoc.spring.example.exceptions.IncorrectNumOfWheelsException;

public class Car {
	
	@Autowired
	private Engine engine;
	private Wheel[] wheels;

	public Wheel[] getWheels() {
		return this.wheels;
	}

	public Engine getEngine() {
		return this.engine;
	}

	@Autowired
	public void setWheels(Wheel[] wheels) throws IncorrectNumOfWheelsException {
		if (wheels.length != 4) {
			throw new IncorrectNumOfWheelsException("Incorrect number of wheels. Needs to be 4");
		}

		this.wheels = wheels;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
