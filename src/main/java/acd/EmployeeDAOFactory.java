/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acd;

/**
 *
 * @author AF
 */
public class EmployeeDAOFactory {
    
    public EmployeeDAO createEmployeeDAOMemory(){
        return new EmployeeDAOMemoryImp();
    }
    
    public EmployeeDAO createEmployeeDAOMySQL(){
        return new EmployeeDAODBMySQLImp();
    }
    
    public EmployeeDAO createEmployeeDAOOracle(){
        return new EmployeeDAODBOracleSQLImp();
    }
    
}
