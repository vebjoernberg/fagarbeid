package graphql.domain;

import java.util.List;

public class Brewery {

    private String name;
    private List<Beer> beers;

    public Brewery() {

    }

    public Brewery(final String name, final List<Beer> beers) {
        this.name = name;
        this.beers = beers;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setBeers(final List<Beer> beers) {
        this.beers = beers;
    }

    public String getName() {
        return name;
    }

    public List<Beer> getBeers() {
        return beers;
    }
}
