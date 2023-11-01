package org.example;

public class TravelTime {
    final int distanceKlFromHomeToOffice = 11;
    final double averageTaxiSpeed = 40.2;
    final double timeTestersToWork = distanceKlFromHomeToOffice / averageTaxiSpeed;
    final double decelerationRateTransportEvening = 0.7;
    final double timeTestersToHome = timeTestersToWork * decelerationRateTransportEvening;
}