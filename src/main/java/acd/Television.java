package acd;

import java.io.Serializable;

public class Television implements ElectronicDevice, Serializable {

    @Override
    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    @Override
    public void turnOff() {
        System.out.println("Turned off");
    }
    
    public void changeChannel(int channel) {
        System.out.println("channel " + channel);
    }
    public void initializeScreen() {
        System.out.println("Completed");
    }
}