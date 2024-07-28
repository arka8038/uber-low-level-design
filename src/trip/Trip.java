package trip;

import strategy.DriverMatchingStrategy;
import strategy.PricingStrategy;

import java.util.UUID;

public class Trip {
    private String tripId;
    private double price;
    private int srcLoc;
    private int destLoc;
    private Rider rider;
    private Driver driver;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;
    private String tripStatus;

    public Trip(Rider rider, Driver driver, int srcLoc, int destLoc, PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy, String tripStatus) {
        this.tripId = UUID.randomUUID().toString();
        this.rider = rider;
        this.driver = driver;
        this.srcLoc = srcLoc;
        this.destLoc = destLoc;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.tripStatus = tripStatus;
    }

    public String getTripId() {
        return tripId;
    }

    public double getPrice() {
        return price;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public DriverMatchingStrategy getDriverMatchingStrategy() {
        return driverMatchingStrategy;
    }

    public String getTripStatus() {
        return tripStatus;
    }
}
