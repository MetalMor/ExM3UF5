package exercicis.ex02;

/**
 * Clase interna estática:
 * Si hacemos que la clase interna sea estática, se puede copiar la 
 * clase concreta Matriu (fichero IteradorConcreta.java) y pegarla 
 * directamente dentro de la clase IteradorInternaEstàtica (con esto
 * evitamos tener que hacer un método no estático solo para llamar al
 * puto constructor de los huevos)
 * 
 * @author mor
 * 041215
 */
public class IteradorInternaEstàtica {
    
    
    private int comptador;
    
    public static void main(String[] args) {
        
        Matriu mat = new Matriu();
        
        for (String s:mat.getMatriu()) {
            
            System.out.println("Contingut: " + s);
            
        }
        
    }
    
    public static class Matriu {
    
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
    
}
