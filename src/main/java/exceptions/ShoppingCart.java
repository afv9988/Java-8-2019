/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author AF
 */
public class ShoppingCart {
    
    public static int readByteFromFile() throws IOException {
        try (InputStream in = new FileInputStream("a.txt")){
            System.out.println("File Open");
            return in.read();
        }
    }
    
}
