package trip;

import strategy.DriverMatchingStrategy;
import strategy.PricingStrategy;
import strategy.StrategyManager;

import java.util.concurrent.ConcurrentHashMap;

public class TripManager {
    private final StrategyManager strategyManager;
    private final ConcurrentHashMap<String, Trip> tripMap;
    private final ConcurrentHashMap<String, TripMetadata> tripMetadataMap;

    public TripManager() {
        RiderManager riderManager = RiderManager.getInstance();
        DriverManager driverManager = DriverManager.getInstance();
        this.strategyManager = StrategyManager.getInstance();
        this.tripMap = new ConcurrentHashMap<>();
        this.tripMetadataMap = new ConcurrentHashMap<>();
    }

    public void createTrip(Rider rider, int srcLoc, int destLoc) {
        TripMetadata tripMetadata = new TripMetadata(rider.getRating(), srcLoc, destLoc);
        DriverMatchingStrategy driverMatchingStrategy = strategyManager.determineDriverMatchingStrategy(tripMetadata);
        PricingStrategy pricingStrategy = strategyManager.determinePricingStrategy(tripMetadata);

        Driver driver = driverMatchingStrategy.matchDriver();

        Trip trip = new Trip(rider, driver, srcLoc, destLoc, pricingStrategy, driverMatchingStrategy, "BOOKED");
        String tripId = trip.getTripId();

        tripMap.put(tripId, trip);
        tripMetadataMap.put(tripId, tripMetadata);
    }

    public ConcurrentHashMap<String, Trip> getTripMap() {
        return tripMap;
    }

    public ConcurrentHashMap<String, TripMetadata> getTripMetadataMap() {
        return tripMetadataMap;
    }
}
