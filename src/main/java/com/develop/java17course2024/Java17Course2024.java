package com.develop.java17course2024;

import acd.Television;
import acd.ElectronicDevice;
import acd.Employee;
import acd.EmployeeDAO;
import acd.EmployeeDAOFactory;
import generics.CacheAny;
import generics.CacheShirt;
import generics.CacheString;
import generics.ComparableStudent;
import generics.Shirt;
import generics.Student;
import generics.StudentSortGpa;
import generics.StudentSortName;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        
        //Comparable
        /*Set<ComparableStudent> studentList = new TreeSet<>();
        
        studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
        studentList.add(new ComparableStudent("John Adams", 2222, 3.9));
        studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
        
        for(ComparableStudent student:studentList){
            System.out.println(student);
        }*/
        
        //Comparator
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
        studentList.add(new Student("John Adams", 2222, 3.9));
        studentList.add(new Student("George Washington", 3333, 3.4));
        
        System.out.println("-----------------By Name");
        Collections.sort(studentList, sortName);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-----------------By GPA");
        Collections.sort(studentList, sortGpa);
        for (Student student : studentList) {
            System.out.println(student);
        }
        
                
    }
}
