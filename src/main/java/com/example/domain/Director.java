package com.example.domain;

/**
 *
 * @author AF
 */
public interface Director {

    public void Director();
    
    public default void DirectorA(){
        System.out.println("234234");
    };
    
}
