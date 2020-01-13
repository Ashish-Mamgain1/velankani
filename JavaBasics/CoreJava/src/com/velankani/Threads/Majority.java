/**
 * 
 */
package com.velankani.Threads;

/**
 * @author ${Ashish Mamgain}
 * 13-Jan-2020
 */
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

public class Majority {
	public static void main(String args[]) {
		int arr[] = {1,2,0,1,0,0,0,1,0,0,2,0,1,0};
		System.out.println(new Geeks().majorityElement(arr, arr.length));
	}
}

class Geeks {

	static boolean isMajor(int a[], int size, int cand) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == cand)
				count++;
		}
		if (count > size / 2)
			return true;
		else
			return false;
	}

	static int majorityElement(int a[], int size)
 {
     int maj_ind=0; 
     int count =1;
     for(int i=0;i<=size-1;i++){
         if(a[maj_ind]==a[i])
        	 count++;
         else 
        	 count--;
     if(count ==0){
         maj_ind=i;
         count =1;
     }
     }
     System.out.println("maj_ind : "+maj_ind);
     System.out.println("a[maj_ind] : "+a[maj_ind]);
     boolean res = 	 isMajor( a, size, a[maj_ind]);
     if(res) return a[maj_ind];
     else return -1;
     
 }
}