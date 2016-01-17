package exercicis.ex06;

import java.util.*;

/**
 *
 * @author mor
 * 
 */
public class FacturaImport implements Comparator<Factura> {
    
    private int codi;
    private String client;
    protected Date data;
    private double imp;

    public FacturaImport() {
        
    }

    public int compare(Factura a, Factura b) {
        
        return (int)(a.getImp() - b.getImp());
        
    }
    
}
