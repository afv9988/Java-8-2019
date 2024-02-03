package acd;

public interface ElectronicDevice {
    static final int JAVA_VAL = 9;
    int variable = 9;
    
    public abstract void turnOn();
    
    public default void turnOff(){
        
        System.out.println("turn of " + variable);
    };
    
}
