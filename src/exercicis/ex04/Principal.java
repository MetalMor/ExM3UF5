package exercicis.ex04;

import java.util.Scanner;

/**
 *
 * @author mor
 * 171215
 */
public class Principal {
    
    public static void main (String[] args) {
        
        System.out.println("Hola. Exercici 04.");
        
        Scanner entrada = new Scanner(System.in);
        ClauDni nif = new ClauDni(llegeixTeclat("Introdueix DNI"));
        
        if(nif.getClau() instanceof String)
            System.out.println("Resultat: " + nif.getDni() + " - " + nif.getClau());
        
    }
    
    private static String llegeixTeclat(String miss) {
        
        String linia = null;
        System.out.println(miss);
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
        
    }
    
}
