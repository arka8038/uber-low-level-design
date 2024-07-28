import java.util.concurrent.ConcurrentHashMap;

public class DriverManager {
    private static volatile DriverManager instance;
    private ConcurrentHashMap<String, Driver> driveMap;


    private DriverManager() {}

    public static synchronized DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }
}
