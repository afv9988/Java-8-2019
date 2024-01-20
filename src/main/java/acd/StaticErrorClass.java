/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class StaticErrorClass {
    
    static private int x;
    public static void staticMethod(){
         x = 1;
        instanceMethod();
    }
    
    public static void instanceMethod(){
        x = 2;
    }
}
