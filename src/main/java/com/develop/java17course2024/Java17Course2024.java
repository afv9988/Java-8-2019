package com.develop.java17course2024;

import acd.Car;
import acd.Computer;
import acd.Television;
import acd.ElectronicDevice;
import acd.PowerState;
import acd.SingletonClass;
import acd.StaticCounter;
import static acd.StaticErrorClass.*;
import static java.lang.Math.random;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        Computer com = new Computer();
        com.setState(PowerState.SUSPEND);
        
        //SingletonClass sc = new SingletonClass();
        SingletonClass.getInstance();
        
        Car car = new Car();
        car.start();
        
    }
}
