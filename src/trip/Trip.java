import strategy.DriverMatchingStrategy;
import strategy.PricingStrategy;

public class Trip {
    private int tripId;
    private double price;
    private Rider rider;
    private Driver driver;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;
    private String tripStatus;

    public Trip(Rider rider, Driver driver, PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy, String tripStatus) {
        this.tripId = tripId;
        this.rider = rider;
        this.driver = driver;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.tripStatus = "PENDING";
    }


}
