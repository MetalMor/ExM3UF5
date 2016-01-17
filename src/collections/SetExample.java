package collections;

import java.util.*;

/**
 *
 * @author mor
 * 031215
 */
public class SetExample {
    
    public static void main(String[] args){
        Set<String> set = new TreeSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three"); // not added, only unique values

        for (String item:set){
            System.out.println("Item: " + item);
        }
        
    }
}
