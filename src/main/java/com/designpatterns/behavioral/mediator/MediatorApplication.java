package com.designpatterns.behavioral.mediator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediatorApplication.class, args);
		FlightControlTowerImpl controlTower = new FlightControlTowerImpl();

		Flight flight1 = new AirbusA320(controlTower, "AA123");
		Flight flight2 = new AirbusA320(controlTower, "BB456");
		Flight flight3 = new AirbusA320(controlTower, "CC789");

		controlTower.registerFlight(flight1);
		controlTower.registerFlight(flight2);
		controlTower.registerFlight(flight3);

		controlTower.notifyRunwayReady();

		for (Flight flight : controlTower.getFlights()) {
			flight.takeoff();
		}
	}

}
