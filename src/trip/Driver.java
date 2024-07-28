public class Driver {
    private String name;
    private Rating rating;
    private boolean isAvailable;

    public Driver(String name, Rating rating, boolean isAvailable) {
        this.name = name;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
