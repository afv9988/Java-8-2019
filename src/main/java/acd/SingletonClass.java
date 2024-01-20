/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class SingletonClass {
    private static final SingletonClass instance 
            = new SingletonClass();
    
    private SingletonClass(){}
    
    public static SingletonClass getInstance(){
        return instance;
    }
}
