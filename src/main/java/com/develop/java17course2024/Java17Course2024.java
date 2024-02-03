package com.develop.java17course2024;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println(myProps.get("password"));
        
        //Print Formats
        PrintWriter pw = new PrintWriter(System.out, true);
        double price = 24.9900; int quantity = 120; String color = "Blue";
        
        System.out.printf("We have %03d %s Polo shirts that cost $%3.1f.\n", quantity, color, price);
        System.out.format("We have %04d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
        String out = String.format("We have %05d %s Polo shirts that cost $%3.5f.\n", quantity, color, price);
        System.out.println(out);
        pw.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
        
        //StringBuilder
        StringBuilder sb = new StringBuilder(500);
        sb.append(", the lightning flashed and the thunder rumbled.\n");
        sb.insert(0, "It was a dark and stormy night");
        sb.append("The lightning struck...\n").append("[  ");
        for (int i = 1; i < 11; i++) {
            sb.append(i).append("  ");
        }
        sb.append("] times");
        System.out.println(sb.toString());
        
        //String methods
        PrintWriter pw = new PrintWriter(System.out, true);
        String tc01 = "It was the best of times";
        String tc02 = "It was the worst of times";
        
        if(tc01.equals(tc02)){
            pw.println("String Match...");
        }
        if(tc01.contains("It was")){
            pw.println("It was found");
        }
        String temp = tc02.replaceFirst("w", "zw");
        pw.println(temp);
        pw.println(tc02.substring(5, 12));
        
        //Split
        String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";
        String[] results = shirts.split(", ");
        for (String shirtStr : results) {
            System.out.println(shirtStr);
        }
        
        //StringTokenizer
        String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";
        StringTokenizer st = new StringTokenizer(shirts, ",");
        
        System.out.println("tockens " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            
        }
        
        //Pattern and Matcher
        String t = "It was the best of times";
        Pattern pattern = Pattern.compile("the");
        Matcher matcher = pattern.matcher(t);
        
        if(matcher.find()){
            System.out.println("Found match!");
        }
        
        //replaceAll
        String header = "<h1>This is an H1</h1>";
        Pattern p1 = Pattern.compile("h1");
        Matcher m1 = p1.matcher(header);
        if(m1.find()){
            header = m1.replaceAll("p");
            System.out.println(header);
        }*/
                
    }
}
