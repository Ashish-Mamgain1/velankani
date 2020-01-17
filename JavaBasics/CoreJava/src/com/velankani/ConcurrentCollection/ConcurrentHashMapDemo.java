/**
 * 
 */
package com.velankani.ConcurrentCollection;

/**
 * @author ${Ashish Mamgain}
 * 17-Jan-2020
 */
//Java program to demonstrate working of ConcurrentHashMap 
import java.util.concurrent.*; 
public class ConcurrentHashMapDemo { 
 public static void main(String[] args) 
 { 
     ConcurrentHashMap m = new ConcurrentHashMap(); 
     m.put(100, "Hello"); 
     m.put(101, "Geeks"); 
     m.put(102, "Geeks"); 

     // Here we cant add Hello because 101 key 
     // is already present in ConcurrentHashMap object 
     m.putIfAbsent(101, "Hello"); 

     // We can remove entry because 101 key 
     // is associated with For value 
     m.remove(101, "Geeks"); 

     // Now we can add Hello 
     m.putIfAbsent(103, "Hello"); 

     // We cant replace Hello with For 
     m.replace(101, "Hello", "For"); 
     System.out.println(m); 
 } 
} 