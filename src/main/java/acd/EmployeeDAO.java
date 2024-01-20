/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package acd;


/**
 *
 * @author AF
 */
public interface EmployeeDAO {
    public void add(Employee emp);
    public void update(Employee emp);
    public void delete(int id);
    public Employee finById(int id);
    public Employee[] getAllEmployees();
}
