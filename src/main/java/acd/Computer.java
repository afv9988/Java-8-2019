/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class Computer {
    private PowerState state;
    public void setState(PowerState powerState) {
        System.out.println("powerState" + powerState.getDescription());
    }
}
