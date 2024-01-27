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

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        CacheString myMessage = new CacheString();
        CacheShirt myShit = new CacheShirt();
        
        CacheAny<String> myGenericMessage = new CacheAny<>();
        CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();
        CacheAny<Integer> myGenericInt = new CacheAny<>();
        
        myMessage.add("Save this for me");
        System.out.println(myMessage.get());
        myGenericMessage.add("Save this for me");
        System.out.println(myGenericMessage.get());
        myGenericInt.add(1);
        System.out.println(myGenericInt.get());
        
        
        System.out.println("String " + myGenericMessage.otherMethod());
        System.out.println("Integer " + myGenericInt.otherMethod());
        
        
                
    }
}
