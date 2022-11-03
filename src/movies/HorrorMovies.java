package movies;

import java.util.List;

public class HorrorMovies extends Movie{

    public HorrorMovies(String movie, int jahr, double rating, List<String> cast, double basePrice) {
        super(movie, jahr, rating, cast, basePrice);
    }

    @Override
    public double calculatePrice(){
        return this.getBasePrice()*0.9;
    }
}
