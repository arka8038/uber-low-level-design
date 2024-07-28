package trip;

public class TripMetadata {
    private Rating riderRating;
    private Rating driverRating;
    private int srcLoc;
    private int destLoc;

    public TripMetadata(Rating riderRating, int srcLoc, int destLoc) {
        this.riderRating = riderRating;
        this.srcLoc = srcLoc;
        this.destLoc = destLoc;
    }

    public Rating getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(Rating riderRating) {
        this.riderRating = riderRating;
    }

    public int getSrcLoc() {
        return srcLoc;
    }

    public void setSrcLoc(int srcLoc) {
        this.srcLoc = srcLoc;
    }

    public int getDestLoc() {
        return destLoc;
    }

    public void setDestLoc(int destLoc) {
        this.destLoc = destLoc;
    }

    public Rating getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Rating driverRating) {
        this.driverRating = driverRating;
    }
}
