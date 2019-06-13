package graphql.domain;

public class Beer {
    private final String name;
    private final Brewery brewery;
    private final String alcohol;

    public Beer(final String name, final Brewery brewery, final String alcohol) {
        this.name = name;
        this.brewery = brewery;
        this.alcohol = alcohol;
    }
}
