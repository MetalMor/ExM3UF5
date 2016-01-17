package exercicis.ex05;

/**
 *
 * @author mor
 * 160116
 */
public final class Quantitat {
    
    private double valor;
    private Unitats unitats;
    protected static final double GR_TO_LL = 0.0022046;
    
    public Quantitat() { }
    
    public Quantitat(double v) {
        
        try {
            setValor(v);
        } catch (InvalidValueException IVe) {
            IVe.printStackTrace();
        }
        
    }

    @Override
    public String toString() {
        return getValor() + " " + getUnitats();
    }
    
    /*
     * ***** GETTERS/SETTERS *****
     */

    public double getValor() {
        return valor;
    }

    public String getUnitats() {
        return unitats.getDescription();
    }

    public void setValor(double v) throws InvalidValueException  {
        
        if (
            v != 100 &&
            v != 200 &&
            v != 400) {
            valor = v;
            unitats = Unitats.GR;
        }
        
        else if(v != 100*GR_TO_LL &&
            v != 200*GR_TO_LL &&
            v != 400*GR_TO_LL) {
            valor = v;
            unitats = Unitats.LL;
        }
        
        else
            throw new InvalidValueException();
        
    }

    public void setUnitats(Unitats uts) {
        
        if(unitats != uts) {

            double v = (unitats == Unitats.GR) ? 
                    valor*GR_TO_LL :
                    valor/GR_TO_LL;
            try {
                setValor(v);
            } catch (InvalidValueException IVe) {
                IVe.printStackTrace();
            } 
            
        }
            
    }
    
}
