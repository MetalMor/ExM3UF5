package comparator;

import java.util.*;

/**
 *
 * @author mor
 * 171215
 */
public class StudentSortName implements Comparator<Student>{
    
    public StudentSortName() { }
    
    public static void main(String[] args) {
        
        // objeto ordenador de listas
        StudentSortName studentListComparator = new StudentSortName();
        
        // instancia de la lista de Students
        List<Student> list = studentListComparator.createStudentsList();
        
        // lista sin ordenar
        studentListComparator.printStudentsList(list); 
        
        // lista ordenada alfabeticamente
        list.sort(studentListComparator);
        studentListComparator.printStudentsList(list); 
        
    }
    
    private List<Student> createStudentsList() {
        
        List<Student> studentsList = new ArrayList<>();
        
        studentsList.add(
                new Student("Transformers")
        );
        studentsList.add(
                new Student("Frog")
        );
        studentsList.add(
                new Student("Ziggyzoog")
        );
        studentsList.add(
                new Student("Nemo")
        );
        
        return studentsList;
        
    }
    
    private void printStudentsList(List<Student> list) {
        
        int comptador = 1;
        
        System.out.println("Listing students:");
        for (Student st : list) {
            
            System.out.println("Student #" + comptador + ": " + st);
            comptador++;
            
        }
        System.out.println("\n");
        
    }
    
    public int compare(Student s1, Student s2){
        int result = s1.getName().compareTo(s2.getName());
        return result;
    }
    
}
