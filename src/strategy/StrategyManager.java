package strategy;

import trip.TripMetadata;

public class StrategyManager {
    private static StrategyManager instance;

    private StrategyManager() {};

    public static synchronized StrategyManager getInstance() {
        if(instance == null) {
            instance = new StrategyManager();
        }
        return instance;
    }

    public PricingStrategy determinePricingStrategy(TripMetadata metadata) {
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy determineDriverMatchingStrategy(TripMetadata metadata) {
        return new NearestDriverMatchingStrategy();
    }
}
