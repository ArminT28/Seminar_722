package movies;

import java.util.List;

public abstract class Movie {
    private  String movie;
    private int jahr;
    private double rating;
    private List<String> cast;
    private double basePrice;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Movie(String movie, int jahr, double rating, List<String> cast, double basePrice) {
        this.movie = movie;
        this.jahr = jahr;
        this.rating = rating;
        this.cast = cast;
        this.basePrice = basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

}
