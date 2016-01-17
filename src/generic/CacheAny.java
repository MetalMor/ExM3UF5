package generic;

/**
 *
 * 271115
 * @author mor
 */
public class CacheAny <T>{
    
    public static void main(String[] args) {
        
        CacheAny<String> myGenericMessage = new CacheAny<>();
        myGenericMessage.add("Ola ke ase");
        
        System.out.println(myGenericMessage.get());
        
    }
    
    private T t;
    
    public void add(T t) {
        this.t = t;
    }
    
    public T get() {
        return this.t;
    }
    
}
