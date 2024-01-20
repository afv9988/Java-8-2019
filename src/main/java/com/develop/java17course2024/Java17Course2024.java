package com.develop.java17course2024;

import com.example.domain.Admin;
import com.example.domain.Car;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.EmployeeStockPlan;
import com.example.domain.Enginner;
import com.example.domain.Manager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AF
 */
public class Java17Course2024 {

    public static void main(String... args) {
        Employee emp1 = new Employee(1254, "Omar Flores", "698798", 30525);
        Employee emp2 = emp1;
        Employee emp3 = new Employee(1254, "Angel Flores", "698798", 30525);
        System.out.println(emp1);
        System.out.println(emp3);
        System.out.println(emp1.equals(emp3));
        
        
        
        
        
    }
}
