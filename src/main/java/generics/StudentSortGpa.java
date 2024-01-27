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
public class StudentSortGpa implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        //return Double.valueOf(s1.getGpa()).compareTo(s2.getGpa());
        if(s1.getGpa() < s2.getGpa()){
            return -1;
        } else if(s1.getGpa() > s2.getGpa()){
            return 1;
        } else {
            return 0;
        }
    }
    
}
