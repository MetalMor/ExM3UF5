package exercicis.ex06;

import java.util.*;

/**
 *
 * @author mor
 * 171215
 */
public class FacturaDate implements Comparator<Factura> {

    public FacturaDate() {
        
    }
    
    public int compare(Factura a, Factura b) {
        
        return a.data.compareTo(b.data);
        
    }
    
}
