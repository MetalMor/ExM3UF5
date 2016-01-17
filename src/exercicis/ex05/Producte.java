package exercicis.ex05;

/**
 *
 * @author mor
 * 160116
 */
public class Producte implements Comparable<Producte> {
    
    private String nom;
    private Quantitat quantitat;
    
    public Producte() { }
    
    public Producte(String n, double v) {
        setNom(n);
        setQuantitat(v);
    }
    
    @Override
    public int compareTo(Producte o) {
        
        int result = 0;
        
        Unitats uts = (this.quantitat.getUnitats().equals("g")) ? 
                Unitats.GR : Unitats.LL;
        
        Producte first = (Producte) this.clone();
        Producte other = (Producte) o.clone();
        other.quantitat.setUnitats(uts);

        result = first.getNom().compareTo(other.getNom());

        if (result == 0)
            result = -(int) (first.quantitat.getValor() - other.quantitat.getValor());
        
        return result;
        
    }

    /*
     * ***** GETTERS/SETTERS *****
     */
    
    public String getNom() {
        return nom;
    }
    
    public Quantitat getQuantitat() {
        return quantitat;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setQuantitat(double v) {
        quantitat = new Quantitat(v);
    }
    
    @Override
    public String toString() {
        return nom + " - " + quantitat;
    }
    
    @Override
    public Producte clone() {
        
        Producte producte = new Producte(this.getNom(), this.quantitat.getValor());
        
        return producte;
    }
    
}
