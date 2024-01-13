package com.example.domain;

/**
 *
 * @author AF
 */
public class EmployeeStockPlan {
    
    public int grandStock(Manager m){
        return 10;
    }
    
    public int grandStock(Enginner m){
        return 20;
    }
    
    public int grandStock(Admin m){
        return 30;
    }
    
    public int grandStock(Employee e){
        System.out.println("grandStock");
        if(e instanceof Manager){
            return grandStock((Manager) e);
        } else if(e instanceof Enginner){
            return grandStock((Enginner) e);
        } else if(e instanceof Admin){
            return grandStock((Admin) e);
        }
        return 0;
    }
    
    
}
