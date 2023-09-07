package com.designpatterns.behavioral.mediator;
// Concrete colleague
public class AirbusA320 extends Flight{
    public AirbusA320(FlightControlTower controlTower, String flightNumber) {
        super(controlTower, flightNumber);
    }

    @Override
    void prepareForTakeoff() {
        System.out.println("Airbus A320 " + flightNumber + " is preparing for takeoff.");
    }

    @Override
    void takeoff() {
        System.out.println("Airbus A320 " + flightNumber + " is taking off.");
        controlTower.notifyTakeoff();
    }
}
