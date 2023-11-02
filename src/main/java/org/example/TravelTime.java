package org.example;

public class TravelTime {
    private final int distanceKlFromHomeToOffice = 11;
    private final double averageTaxiSpeed = 40.2;
    private final double timeTestersToWork = distanceKlFromHomeToOffice / averageTaxiSpeed;
    private final double decelerationRateTransportEvening = 0.7;
    private final double timeTestersToHome = timeTestersToWork * decelerationRateTransportEvening;
}