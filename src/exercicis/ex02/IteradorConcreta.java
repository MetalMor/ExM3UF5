package exercicis.ex02;

/**
 * Clase concreta:
 * Nada chungo, simplemente 2 clases en un archivo que van juntas.
 * 
 * @author mor
 * 041215
 */
public class IteradorConcreta {
    
    public static void main(String[] args) {
        
        Matriu mat = new Matriu();
        
        for (String s:mat.getMatriu()) {
            
            System.out.println("Contingut: " + s);
            
        }
        
    }
    
}

class Matriu {
    
    private String[] matriu = new String[5];
    
    public Matriu() {
        
        this.matriu[0] = "Casa";
        this.matriu[1] = "Cotxe";
        this.matriu[2] = "Cavall";
        this.matriu[3] = "Calavera";
        this.matriu[4] = "Cargol";
        
    }
    
    public String[] getMatriu() {
        
        return this.matriu;
        
    }
    
}

