package movies;

import java.util.List;

public class SciFiMovies extends Movie{

    public SciFiMovies(String movie, int jahr, double rating, List<String> cast, double basePrice) {
        super(movie, jahr, rating, cast, basePrice);
    }

    @Override
    public double calculatePrice()
    {
        return this.getBasePrice()*0.9;
    }
}
