package com.designpatterns.behavioral.mediator;
// Mediator interface
public interface FlightControlTower {
    void registerFlight(Flight flight);
    void notifyRunwayReady();
    void notifyTakeoff();
}
