package exercicis.ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mor
 * 170116
 */
public class Magatzem implements Comparator<Producte> {
    
    public Magatzem() { }
    
    public static void main(String[] args) {
        
        Magatzem magatzem = new Magatzem();
        
        List<Producte> list = magatzem.crearLlistaProductes();
        
        System.out.println("**__Llista sense ordre__**");
        magatzem.mostrarLlistaProductes(list); 
        
        list.sort(magatzem);
        System.out.println("**__Llista ordenada__**");
        magatzem.mostrarLlistaProductes(list); 
        
    }

    private List<Producte> crearLlistaProductes() {
        
        List<Producte> llistaProductes = new ArrayList<>();
        
        llistaProductes.add(
                new Producte("Fairy", 200)
        );
        llistaProductes.add(
                new Producte("Cola la Casera", 400*Quantitat.GR_TO_LL)
        );
        llistaProductes.add(
                new Producte("Oreo", 200*Quantitat.GR_TO_LL)
        );
        llistaProductes.add(
                new Producte("Oreo", 100)
        );
        
        return llistaProductes;
        
    }
    
    private void mostrarLlistaProductes(List<Producte> list) {
        
        int comptador = 1;
        
        System.out.println("Productes al magatzem:");
        for (Producte p : list) {
            
            System.out.println("Producte #" + comptador + ": " + p);
            comptador++;
            
        }
        System.out.println("\n");
        
    }
    
    @Override
    public int compare(Producte o1, Producte o2) {
        int result = o1.compareTo(o2);
        return result;
    }
    
}
