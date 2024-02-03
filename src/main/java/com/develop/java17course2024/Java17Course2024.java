package com.develop.java17course2024;

import exceptions.Portfolio;
import exceptions.PortfolioException;
import exceptions.Stock;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) throws PortfolioException {
        //Byte Stream
        /*byte[] b = new byte[128];
        int bLen = b.length;
        try (FileInputStream fis = new FileInputStream(args[0]);
                FileOutputStream fos = new FileOutputStream(args[1])){
            System.out.println("args[0] " + args[0]);
            System.out.println("args[1] " + args[1]);
            System.out.println("Bytes available: " + fis.available());
            int count = 0; 
            int read = 0;
            while((read=fis.read(b)) != -1){
                if(read < bLen) fos.write(b, 0, read);
                else fos.write(b);
                count += read;
            }
            System.out.println("Wrote: " + count);
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        
        //Char Stream
        char[] c = new char[128];
        int cLen = c.length;
        try (FileReader fr = new FileReader(args[0]);
                FileWriter fw = new FileWriter(args[1])){
            int count = 0; 
            int read = 0;
            while((read=fr.read(c)) != -1){
                if(read < cLen) fw.write(c, 0, read);
                else fw.write(c);
                count += read;
            }
            System.out.println("Wrote: " + count);
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        //BufferedStream
        try (BufferedReader bufInput = 
                new BufferedReader(new FileReader(args[0]));
                BufferedWriter bufOutput = 
                        new BufferedWriter(new FileWriter(args[1]))){
            String line = "";
            while((line = bufInput.readLine()) != null){
                    bufOutput.write(line);
                    bufOutput.newLine();
                }
            
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }*/
        
        //Serializacion
        Stock s1 = new Stock("ORCL", 100, 32.50);
        Stock s2 = new Stock("APPL", 100, 245);
        Stock s3 = new Stock("GOGL", 100, 54.67);
        Portfolio p = new Portfolio(s1, s2, s3);
        try (FileOutputStream fos = new FileOutputStream(args[0]);
                ObjectOutputStream out = new ObjectOutputStream(fos)){
            out.writeObject(p);
        } catch (IOException e) {
            System.out.println("Exception writing out Portfolio: " + e);
        }
        System.out.println("Serializated");
        try (FileInputStream fis = new FileInputStream(args[0]);
                ObjectInputStream in = new ObjectInputStream(fis)){
            Portfolio newP = (Portfolio) in.readObject();
            System.out.println(newP.toString());
            
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Exception reading in Portfolio: " + e);
        }
                
    }
}
