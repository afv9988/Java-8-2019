/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import com.example.domain.Employee;

/**
 *
 * @author AF
 */
public class EmployeeDAO {
    static Employee[] employeeArray = {};
    
    public static Employee findById(int id) throws DAOException {
        try {
            return employeeArray[id];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            throw new DAOException("Error finding employee in DAO", e);
        }
    }
}
