/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public enum PowerState {
    OFF("power off"),
    ON("power on"),
    SUSPEND("power suspend");
    
    private String description;
    
    private PowerState(String d){
        description = d;
    }

    public String getDescription() {
        return description;
    }

    
    
}
