package exercicis.ex05;

/**
 *
 * @author mor
 * 160116
 */
public enum Unitats {
    
    GR("g"),
    LL("lb");
    
    private final String description;
    
    private Unitats(String d) {
        description = d;
    }
    
    String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
    
}
