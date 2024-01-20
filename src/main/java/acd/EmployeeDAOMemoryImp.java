/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AF
 */
public class EmployeeDAOMemoryImp implements EmployeeDAO{
    
    private static List<Employee> employeeArray = new ArrayList();

    @Override
    public void add(Employee emp) {
        employeeArray.add(emp);
    }

    @Override
    public void update(Employee emp) {
        employeeArray.remove(emp);
        employeeArray.add(emp);
    }

    @Override
    public void delete(int id) {
        employeeArray.remove(id);
    }

    @Override
    public Employee finById(int id) {
        return employeeArray.get(id);
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
    
}
