package exercicis.ex04;

/**
 *
 * @author mor
 * 171215
 */
public class ClauDni {
    
    private int dni;
    private String clau;
    
    public ClauDni(String dni) {
        
        
        try {
            
            if(this.setDni(dni)) 
                setClau();
            
        } catch(Exception e) {
            
            switch(e.getMessage()) {
                
                case "dniBuit":
                    System.out.println("Camp del DNI buit.");
                    break;
                   
                case "dniLlarg":
                    System.out.println("8 caràcters com a màxim.");
                    break;
                
                case "dniIncorrecte":
                    System.out.println("Només caràcters alfanumèrics.");
                    break;
                
            }
            
        }
        
    }
    
    public int getDni() {
        return dni;
    }
    
    public String getClau() {
        return clau;
    }
    
    public boolean setDni(String str) throws DniLlargException, DniBuitException, DniIncorrecteException {
        
        if (str.length() > 8) {
            
            assert (str == "012345689");
            throw new DniLlargException();
            
        }
        
        if (str.length() == 0) {
            
            assert (str == "");
            throw new DniBuitException();
            
        }
        
        int d;
        
        try {  
            
          d = Integer.parseInt(str);  
          
        } catch(NumberFormatException nfe) { 
            
          throw new DniIncorrecteException(); 
          
        }    
        
        dni = d;
        return true;
        
    }
    
    public void setClau() {
        clau = String.valueOf(dni%23);
    }
    
}
