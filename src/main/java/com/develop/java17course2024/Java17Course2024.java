package com.develop.java17course2024;

import com.example.domain.Admin;
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
        Employee emp = new Employee(1254, "Omar Flores", "698798", 30525);
        
        Employee man = new Manager("RH", 565, "Angel Flores", "65468456534", 3025);
        Employee eng = new Enginner("RH", 565, "Angel Flores", "65468456534", 3026);
        Employee adm = new Admin("RH", 565, "Angel Flores", "65468456534", 3027);
        
        //System.out.println("Employee name " + emp.getDetails());
        //System.out.println("Manager name " + man.getDetails());
        
        Employee emp2 = new Manager("RH", 1254, "Omar Flores", "698798", 30525);
        //System.out.println(emp2.getDetails());
        
        EmployeeStockPlan esp = new EmployeeStockPlan();
        
        System.out.println("Stock plan " + esp.grandStock(adm));
        System.out.println("Stock plan " + esp.grandStock(man));
        System.out.println("Stock plan " + esp.grandStock(eng));
        
        
        
        
        
    }
}
