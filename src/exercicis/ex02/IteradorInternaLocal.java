package exercicis.ex02;

/**
 * Clase interna:
 * Hay que hacer un método "inici" a parte del main, porque no se puede
 * llamar al constructor de una clase interna no estática desde un
 * método estático (el main es estático).
 * 
 * @author mor
 * 041215
 */
public class IteradorInternaLocal {
    
    public static void main(String[] args) {
        
        IteradorInterna it = new IteradorInterna();
        it.inici();
        
    }
    
    public void inici() {
        
        class Matriu {
    
            private String[] matriu = new String[5];

            public Matriu() {

                matriu[0] = "Casa";
                matriu[1] = "Cotxe";
                matriu[2] = "Cavall";
                matriu[3] = "Calavera";
                matriu[4] = "Cargol";

            }

            public String[] getMatriu() {

                return matriu;

            }
    
        }
        
        Matriu mat = new Matriu();
        
        for (String s:mat.getMatriu()) {
            
            System.out.println("Contingut: " + s);
            
        }
        
    }
    
}