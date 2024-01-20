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
    private static boolean running = false;
    private static final Engine engine = new Engine();
    
    private static class Engine {
    
        private Engine(){}
        
        private static Engine getInstance(){
            return engine;
        }

        private void start() {
            running = true;
        }
    }
    
    public void start(){
        Engine.getInstance().start();
    }
}
