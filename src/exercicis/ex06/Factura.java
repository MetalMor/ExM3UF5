package exercicis.ex06;

import java.util.*;

/**
 *
 * @author mor
 * 171215
 */
public class Factura {
    
    private int codi;
    private String client;
    protected Date data;
    private double imp;

    public Factura(int codi, String client, int y, int m, int d, double imp) {
        
        this.codi = codi;
        this.client = client;
        this.data = new Date(y, m, d);
        this.imp = imp;
        
    }

    public int getCodi() {
        
        return codi;
        
    }

    public String getClient() {
        
        return client;
        
    }
    
    public Date getData() {
        
        return data;
        
    }

    public double getImp() {
        
        return imp;
        
    }

    @Override
    public String toString() {
        
        return this.getClient() + '(' + this.getCodi() + ") - " + this.getData() + " - " + this.getImp();
        
    }
    
    
    
}
