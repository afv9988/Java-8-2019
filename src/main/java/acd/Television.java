package acd;

import com.sun.source.doctree.SerialDataTree;
import java.io.Serial;
import java.io.Serializable;

public class Television extends ElectronicDevice {

    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
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