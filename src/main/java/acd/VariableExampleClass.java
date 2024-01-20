/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

import java.util.Date;

/**
 *
 * @author AF
 */
public class VariableExampleClass {
    private final int field;
    private final int forgottenField;
    private final StaticCounter sc = new StaticCounter();
    public static final int JAVA_CONSTANT = 10;
    
    public VariableExampleClass(){
        field = 20;
        forgottenField = 20;
    }
    
    public void chageValues(final int param){
        //param = 87;
        sc.setCounter(param);
        final int localVar;
        localVar = 67;
    }
    
}
