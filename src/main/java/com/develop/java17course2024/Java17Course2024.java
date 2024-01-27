package com.develop.java17course2024;

import acd.Television;
import acd.ElectronicDevice;
import acd.Employee;
import acd.EmployeeDAO;
import acd.EmployeeDAOFactory;
import generics.CacheAny;
import generics.CacheShirt;
import generics.CacheString;
import generics.Shirt;
import java.util.ArrayDeque;
import java.util.ArrayList;
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
        
        //Arraylist
        /*List<Integer> partList = new ArrayList<>();
        
        partList.add(1111);
        partList.add(2222);
        partList.add(3333);
        partList.add(4444);
        
        System.out.println("First Part " + partList.get(0));
        partList.add(0, 5555);
        
        System.out.println("after alter Part " + partList.get(0));
        System.out.println("after alter Part " + partList.get(1));
        System.out.println("after alter Part " + partList.size());
        
        Iterator<Integer> elements = partList.iterator();
        
        while(elements.hasNext()){
            Integer partNumberObject = elements.next();
            System.out.println("Part Number " + partNumberObject.intValue());
        }
        
        for(Integer partNumberObject2: partList){
            System.out.println("Part number2 " + partNumberObject2);
        }
        
        //Auto Box - Unbox
        Integer intObject = new Integer(1);
        int intPrimitive = 2;
        
        Integer tempInteger;
        int tempPrimitive;
        
        tempInteger = new Integer(intPrimitive);
        tempPrimitive = intObject.intValue();
        
        tempInteger = intPrimitive; //auto box
        tempPrimitive = intObject;  //auto unbox
        
        //Sets
        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");
        set.add("angel");
        
        for(String item:set){
            System.out.println("Item " + item);
        }
        
        Set<Integer> setInt = new TreeSet<>();
        
        setInt.add(654);
        setInt.add(846);
        setInt.add(100);
        setInt.add(200);
        setInt.add(5);
        
        for(Integer item:setInt){
            System.out.println("Item " + item);
        }
        
        //Map
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("S003", "Duke Hat");
        System.out.println("S002 original value " + partList.get("S002"));
        
        partList.put("S002", "Black T-Shirt");   //overwrited
        partList.put("S004", "Blue Polo Shirt"); 
        System.out.println("S002 new value " + partList.get("S002"));
        for(String key: partList.keySet()){
            System.out.println("Part#:" + key + " " + partList.get(key));
        }*/
        
        //Deque
        Deque<String> stack = new ArrayDeque<>();
        stack.push("One");
        stack.push("two");
        stack.push("three");
        
        //LIFO
        //push One, two, three
        //pop three, two, One
        
        while (!stack.isEmpty()) {            
            System.out.println(stack.pop());
        }
        
        Deque<String> queue = new ArrayDeque<>();
        queue.add("One");
        queue.add("two");
        queue.add("three");
        System.out.println("------------------------");
        
        //FIFO
        //add One, two, three
        //remove One, two, three
        
        while (!queue.isEmpty()) {            
            System.out.println(queue.remove());
            //queue.remove();
        }

                
    }
}
