package com.example.domain;

import java.util.ArrayList;

/**
  * @author AF*

 */
public class Admin extends Employee {
    
    private String permissions;

    public Admin(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.permissions = deptName;
    }

    public String getPermissions() {
        return permissions;
    }
    
    
}
