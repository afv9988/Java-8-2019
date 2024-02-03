package com.develop.java17course2024;

import exceptions.DAOException;
import exceptions.EmployeeDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        
        try {
            //try-catch
            /*try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("File open");
            int data = in.read();
            in.close();
            } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting");
            } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting");
            }
            //Catching multiple Exceptions
            String cartFile = "";
            ShoppingCart cart = null;
            try (InputStream is = new FileInputStream(cartFile)){
            ObjectInputStream in = new ObjectInputStream(is);
            cart = (ShoppingCart) in.readObject();
            } catch (ClassNotFoundException | IOException e) {
            System.out.println("Exception deserializing " + cartFile);
            System.out.println(e);
            }
            
            //Declaring Exceptions
            try {
            int data = ShoppingCart.readByteFromFile();
            } catch (IOException e) {
            System.out.println(e.getMessage());
            }*/
            
            //Custom Exceptions
            EmployeeDAO.findById(0);
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }

        
        
        
                
    }
}
