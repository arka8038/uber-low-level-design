package strategy;

import trip.Driver;
import trip.DriverManager;
import trip.Rating;

import java.util.concurrent.ConcurrentHashMap;

public class NearestDriverMatchingStrategy implements  DriverMatchingStrategy {
    private DriverManager driverManager;

    @Override
    public Driver matchDriver() {
        ConcurrentHashMap<String, Driver> map = driverManager.getDriveMap();
        //Other operations

        return new Driver("Arka", Rating.FOUR_STAR, true);
    }
}
