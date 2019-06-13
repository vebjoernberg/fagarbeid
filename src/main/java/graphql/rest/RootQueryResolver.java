package graphql.rest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.domain.Beer;
import graphql.domain.Brewery;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class RootQueryResolver implements GraphQLQueryResolver {

    public String getHello() {
        return "Hello World";
    }

//    public Beer getBeer() {
//        final var beer = new Beer("Perler for svin", "Lervig", "5,6%");
//        return beer;
//    }

    public Brewery getBrewery(final String name) {
        if (name.equals("Lervig")) {
            final var lervig = new Brewery();
            lervig.setName("Lervig");
            final var beer = new Beer("Perler for svin", lervig, "5,2%");
            final var beer2 = new Beer("Tropical Juice", lervig, "6,3%");
            final var beers = Arrays.asList(beer, beer2);
            lervig.setBeers(beers);
            return lervig;
        } else {
            final var ringnes = new Brewery();
            ringnes.setName("Ringnes");
            final var lite = new Beer("Lite", ringnes, "4,6%");
            final var beers = Arrays.asList(lite);
            ringnes.setBeers(beers);
            return ringnes;
        }

    }
}
