package com.example.domain;

import java.util.ArrayList;

/**
  * @author AF*

 */
public class Enginner extends Employee {
    
    private String skill;

    public Enginner(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.skill = deptName;
    }

    public String getSkill() {
        return skill;
    }
    
    
}
