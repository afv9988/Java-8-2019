/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class Car {
    private boolean running = false;
    private Engine engine = new Engine();
    
    
    private class Engine {
        public void start() {
            running = true;
        }
    }
    
    public void start(){
        engine.start();
    }
}
