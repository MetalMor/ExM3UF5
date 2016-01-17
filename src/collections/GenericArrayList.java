package collections;

import java.util.*;

/**
 *
 * @author mor
 * 031215
 */
public class GenericArrayList {
    
    public static void main(String args[]) {
        
        List<Integer> partList = new ArrayList<>(3);

        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
        // partList.add("Bad Data");  // compile error now


        Iterator<Integer> elements = partList.iterator();
        
        /*
         * UNBOXING CUTRE SALCHICHERO
         */
        while (elements.hasNext()) {
            
            Integer partNumberObject = elements.next();
            int partNumber = partNumberObject.intValue();

            System.out.println("Part number: " + partNumber);
            
        }
        
        /*
         * UNBOXING CORTO GUAY
         */
        for (Integer partNumberObj:partList){
            
            int partNumber = partNumberObj; // Demos auto unboxing
            System.out.println("Part number: " + partNumber);  
            
        }
        
    }   
    
}
