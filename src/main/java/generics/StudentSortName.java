/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.Comparator;

/**
 *
 * @author AF
 */
public class StudentSortName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());
        if(result != 0){
            return result;
        } else {
            return 0;
        }
        
    }
    
}
