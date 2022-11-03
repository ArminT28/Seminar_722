package movies;

import java.util.List;

public class ComedyMovies extends Movie{

    public ComedyMovies(String movie, int jahr, double rating, List<String> cast, double basePrice) {
        super(movie, jahr, rating, cast, basePrice);
    }

    @Override
    public double calculatePrice()
    {
        if(this.getCast().contains("adam Sandler")){
            return this.getBasePrice() *0.5;

        }
        else
        {
            return this.getBasePrice();
        }
    }
}
