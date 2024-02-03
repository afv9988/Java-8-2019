package com.develop.java17course2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author AF
 */

public class Java17Course2024 {

    public static void main(String... args) {
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
        }*/
        //BufferedStream
                
    }
}
