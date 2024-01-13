package com.example.domain;

/**
 *
 * @author AF
 */
public class Director extends Manager{
    private double budget;

    public Director(double budget, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budget = budget;
    }
    
    public void approveExpense(double exp){
        System.out.println("Approved");
    }
    public double getBudget() {
        return budget;
    }
    
}
