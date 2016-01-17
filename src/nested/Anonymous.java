package nested;

/**
 *
 * @Anonymous:
 * Una clase creada en el momento de instanciarla. Sólo existe durante la vida
 * del objeto instanciado.
 * Se puede usar una interficie como nombre del constructor para hacer q la
 * clase anónima la implemente.
 * 
 * 261115
 * @author mor
 */
public class Anonymous {
    
    public Object o = new Object() {
        
        @Override
        public String toString() {
        
            return "In an anonymous class method";
            
        }
        
    };  
    
}
