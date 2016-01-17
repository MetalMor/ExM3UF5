package exercicis.ex06;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author mor
 * 171215
 */
public class Principal {
    
    public static void main (String[] args) {
        
        System.out.println("Hola\nExercici 06 => Llistat de factures.");
        
        List<Factura> llistaFactures = crearLlista();
        
        /*
         * Ordena y lista siguiendo el método compare(a,b) de FacturaDate, que
         * ordena por fechas.
         */
        System.out.println("Llista ordenada per dates:");
        Collections.sort(llistaFactures, new FacturaDate());
        mostrarLlista(llistaFactures);
        
        System.out.println("\n");
        
        /*
         * Ordena y lista siguiendo el método compare(a,b) de FacturaImport, que
         * ordena por importes.
         */
        System.out.println("Llista ordenada per imports:");
        Collections.sort(llistaFactures, new FacturaImport());
        mostrarLlista(llistaFactures);
        
    }
    
    private static void mostrarLlista(List llista) {
        
        for (Object fact: llista) {
            
            System.out.println(fact);
            
        }
        
    }
    
    private static List<Factura> crearLlista() {
        
        List<Factura> llistaFactures = new ArrayList<>();
        
        Factura fact1 = new Factura(
        00,
        "Pepito",
        2009,
        11,
        17,
        26.35
        );
        
        Factura fact2 = new Factura(
        01,
        "Juanito",
        2002,
        3,
        26,
        52.60
        );
        
        Factura fact3 = new Factura(
        02,
        "Jorgito",
        2010,
        7,
        9,
        12.95
        );
        
        Factura fact4 = new Factura(
        03,
        "Pedrito",
        2004,
        12,
        2,
        76.00
        );
        
        Factura fact5 = new Factura(
        04,
        "Luisito",
        2015,
        3,
        24,
        8.50
        );
        
        llistaFactures.add(fact1);
        llistaFactures.add(fact2);
        llistaFactures.add(fact3);
        llistaFactures.add(fact4);
        llistaFactures.add(fact5);
        
        return llistaFactures;
        
    }
    
}
