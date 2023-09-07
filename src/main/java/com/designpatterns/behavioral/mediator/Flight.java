package com.designpatterns.behavioral.mediator;
// Colleague interface
public abstract class Flight {
    protected FlightControlTower controlTower;
    protected String flightNumber;

    public Flight(FlightControlTower controlTower, String flightNumber) {
        this.controlTower = controlTower;
        this.flightNumber = flightNumber;
    }

    abstract void prepareForTakeoff();
    abstract void takeoff();

    public String getFlightNumber() {
        return flightNumber;
    }
}
