package nested;

/**
 * 
 * @Inner:
 * Engine tiene acceso a los atributos de Inner, pero no al revés.
 * Engine sólo se puede instanciar desde la clase Inner.
 * 
 * 261115
 * @author mor
 */
public class Inner {
    
    private boolean running = false;
    private Engine engine = new Engine();
    
    private class Engine {
        
        public void start() {
            
            running = true;
            
        }
        
    }
    
    public void start() {
    
        engine.start();
        
    }
    
}
