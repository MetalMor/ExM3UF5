package exercicis.ex02;

/**
 * Clase interna anónima:
 * En principio no se puede hacer un constructor de una clase anónima,
 * pero como soy más chulo que nadie, le he puesto "void" al construcor
 * y ya está; lo guay es que ya no es necesario hacer un método "inici"
 * y se puede meter todo en el main (ahora la clase interna, como es
 * anónima, no ha de ser estática ni nada).
 * 
 * @author mor
 * 041215
 */
public class IteradorInternaAnònima {
    
    public static void main(String[] args) {
        
        Matriu mat = new Matriu(){
    
            private String[] matriu = new String[5];

            public void Matriu() {

                matriu[0] = "Casa";
                matriu[1] = "Cotxe";
                matriu[2] = "Cavall";
                matriu[3] = "Calavera";
                matriu[4] = "Cargol";

            }

            public String[] getMatriu() {

                return matriu;

            }
    
        };
        
        for (String s:mat.getMatriu()) {
            
            System.out.println("Contingut: " + s);
            
        }
        
    }
        
        
}