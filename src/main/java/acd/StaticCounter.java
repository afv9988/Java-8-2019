/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class StaticCounter {
    private static int counter = 0;
    
    public StaticCounter(){
        counter++;
    }
    public static int getCount(){
        return counter;
    }

    public static void setCounter(int counter) {
        StaticCounter.counter = counter;
    }
    
    
    
}
