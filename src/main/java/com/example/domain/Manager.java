package com.example.domain;

import java.util.ArrayList;

/**
  * @author AF*

 */
public class Manager extends Employee {
    
    private String deptName;

    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    public void calculateBruteSalary(int tax){
        System.out.println("Salary minus tax: " + (super.getSalary() - tax));
        
    }
    public int calculateBruteSalary(float tax){
        System.out.println("Salary minus tax: " + (super.getSalary() - tax));
        return 0;
        
    }
    public void calculateBruteSalary(int... tax){
        for (double d : tax) {
            System.out.println("Salary minus tax: " + (super.getSalary() - d));
        }
        
    }
    
    public void addEMployee(ArrayList employes, Employee emp){
        employes.add(emp);
        System.out.println("added " + emp.getName());
    }

    public void removeEmployee(ArrayList employes, Employee emp){
        employes.remove(emp);
    }
}
