package TheNewBoston3CollectionSort;

public enum Size {
    SMALL("S"), MEDIUM("M");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
