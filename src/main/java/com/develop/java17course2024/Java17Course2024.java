package com.develop.java17course2024;

import acd.Television;
import acd.ElectronicDevice;
import acd.Employee;
import acd.EmployeeDAO;
import acd.EmployeeDAOFactory;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        Television ed = new Television();
        System.out.println(ElectronicDevice.variable);
        ed.turnOff();
        
        EmployeeDAOFactory factory = new EmployeeDAOFactory();
        EmployeeDAO employe = factory.createEmployeeDAOMySQL();
        
        employe.add(new Employee());
                
    }
}
