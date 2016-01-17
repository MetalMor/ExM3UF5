package exercicis.ex05;

/**
 *
 * @author mor
 * 160116
 */
public class InvalidValueException extends Exception {
    
    private static String error = "Només 100, 200 o 400 grams (o el mateix en lliures).";
    
    public InvalidValueException() {
        super(error);
    }
    
    public String getError() {
        return error;
    }
    
}
