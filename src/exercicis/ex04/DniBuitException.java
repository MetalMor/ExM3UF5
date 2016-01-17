package exercicis.ex04;

/**
 *
 * @author mor
 * 171215
 */
public class DniBuitException extends Exception {
    
    private static String error = "dniBuit";
    
    public DniBuitException() {
        super("dniBuit");
    }
    
    public String getError() {
        return error;
    }
    
}
