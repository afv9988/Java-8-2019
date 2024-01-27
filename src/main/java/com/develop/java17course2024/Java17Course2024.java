package com.develop.java17course2024;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
        
        //Properties
        /*Properties myProps = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\generics\\ServerInfo.properties");
            myProps.load(fis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(myProps.get("userName"));
        System.out.println(myProps.get("hostName"));
        System.out.println(myProps.get("password"));*/
        
        //Print Formats
        PrintWriter pw = new PrintWriter(System.out, true);
        double price = 24.9900; int quantity = 120; String color = "Blue";
        
        System.out.printf("We have %03d %s Polo shirts that cost $%3.1f.\n", quantity, color, price);
        System.out.format("We have %04d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
        String out = String.format("We have %05d %s Polo shirts that cost $%3.5f.\n", quantity, color, price);
        System.out.println(out);
        pw.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
                
    }
}
