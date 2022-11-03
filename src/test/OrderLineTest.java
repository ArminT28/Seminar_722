package test;

import movies.HorrorMovies;
import movies.Movie;
import movies.OrderLine;
import movies.SciFiMovies;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderLineTest {

    OrderLine orderLine1,orderLine2;

    @BeforeEach //execute this before each test //@BeforeAll -> execute this ONCE, THEN run all tests
    void setUp()
    {
        List<String> avatarCast = new ArrayList<>();
        avatarCast.add("Jack Nicholson");
        avatarCast.add("Shelly Duvall");

        List<String> shinningCast = new ArrayList<>();
        shinningCast.add("Jack Nicholson");
        shinningCast.add("Shelly Duvall");

        Movie theShinning = new HorrorMovies("The Shinning",1980,7.2,shinningCast,4);
        Movie avatar = new SciFiMovies("Avatar",1980,8.8,avatarCast,7);


        orderLine1 = new OrderLine(avatar,3);
        orderLine2 = new OrderLine(theShinning,4);
    }

    @Test
    void calculatePrice() {

        assertEquals(12,0,orderLine1.calculatePrice());
        assertEquals(7*4*0.9,orderLine2.calculatePrice());

    }

    @Test
    void testFilmTitle()
    {
        assertEquals("The Shinning",orderLine1.getMovie().getMovie());
    }

}