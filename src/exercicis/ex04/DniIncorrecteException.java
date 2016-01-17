package exercicis.ex04;

/**
 *
 * @author mor
 * 171215
 */
public class DniIncorrecteException extends Exception {
    
    private static String error = "dniIncorrecte";
    
    public DniIncorrecteException() {
        super("dniIncorrecte");
    }
    
    public String getError() {
        return error;
    }
    
}
