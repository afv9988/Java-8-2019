package acd;

public sealed interface ElectronicDevice permits Television {
    static final int JAVA_VAL = 9;
    int variable = 9;
    
    public abstract void turnOn();
    
    public default void turnOff(){
        
        System.out.println("turn of " + variable);
    };
    
}
