import java.util.concurrent.ConcurrentHashMap;

public class TripManager {
    private final RiderManager riderManager;
    private final DriverManager driverManager;
    private ConcurrentHashMap<Integer, Trip> tripMap;
    private ConcurrentHashMap<Integer, TripMetadata> tripMetadataMap;


    public TripManager() {
        this.riderManager = RiderManager.getInstance();
        this.driverManager = DriverManager.getInstance();
        this.tripMap = new ConcurrentHashMap<>();
        this.tripMetadataMap = new ConcurrentHashMap<>();
    }

    public void createTrip(Rider rider, int srcLoc, int destLoc) {

    }

    public ConcurrentHashMap<Integer, Trip> getTripMap() {
        return tripMap;
    }

    public ConcurrentHashMap<Integer, TripMetadata> getTripMetadataMap() {
        return tripMetadataMap;
    }
}
