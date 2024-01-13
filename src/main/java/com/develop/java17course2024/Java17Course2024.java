package com.develop.java17course2024;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AF
 */
public class Java17Course2024 {

    public static void main(String... args) {
        
        ArrayList<Employee> staf = new ArrayList<>();
        Manager man = new Manager("RH", 565, "Angel Floress", "65468456534", 3025);
        Employee emp = new Employee(565, "Angel Floress", "65468456534", 3025);
        
        man.addEMployee(staf, emp);
        System.out.println("Employees " + staf.toString());
        man.removeEmployee(staf, emp);
        System.out.println("Employees " + staf.toString());
        
        
        
        
    }
}
