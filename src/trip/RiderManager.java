package trip;

import java.util.concurrent.ConcurrentHashMap;

public class RiderManager {
    private static RiderManager instance;
    private ConcurrentHashMap<String, Rider> riderMap;

    private RiderManager() {}

    public static synchronized RiderManager getInstance() {
        if (instance == null) {
            instance = new RiderManager();
        }
        return instance;
    }
}
