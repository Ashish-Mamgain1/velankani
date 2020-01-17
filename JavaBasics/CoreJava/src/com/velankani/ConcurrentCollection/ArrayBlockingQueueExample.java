/**
 * 
 */
package com.velankani.ConcurrentCollection;

/**
 * @author ${Ashish Mamgain}
 * 17-Jan-2020
 */

import java.util.concurrent.ArrayBlockingQueue; 
  
public class ArrayBlockingQueueExample { 
  
    public static void main(String[] args) 
    { 
        // define capacity of ArrayBlockingQueue 
        int capacity = 15; 
  
        // create object of ArrayBlockingQueue 
        ArrayBlockingQueue<Integer> abq 
            = new ArrayBlockingQueue<Integer>(capacity); 
  
        // add  numbers 
        abq.add(1); 
        abq.add(2); 
        abq.add(3); 
  
        // print queue 
        System.out.println("ArrayBlockingQueue:"
                           + abq); 
  
        // remove all the elements 
        abq.clear(); 
  
        // print queue 
        System.out.println("ArrayBlockingQueue:"
                           + abq); 
    } 
} 