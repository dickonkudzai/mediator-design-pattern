package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
// Concrete mediator
public class FlightControlTowerImpl implements FlightControlTower{
    private List<Flight> flights;
    private boolean runwayReady;

    public FlightControlTowerImpl() {
        this.flights = new ArrayList<>();
        this.runwayReady = false;
    }

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void notifyRunwayReady() {
        runwayReady = true;
        System.out.println("Runway is ready for takeoff.");
        for (Flight flight : flights) {
            flight.prepareForTakeoff();
        }
    }

    @Override
    public void notifyTakeoff() {
        runwayReady = false;
        System.out.println("Flight has taken off. Runway is now available.");
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
