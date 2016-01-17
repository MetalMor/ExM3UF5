package comparator;

/**
 *
 * @author mor
 * 150116
 */
public class Student {
    
    private String name;
    
    public Student() { }
    
    public Student(String n) {
        
        name = n;
        
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}
