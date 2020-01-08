/**
 * 
 */
package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain}
 * 08-Jan-2020
 * 
 * Checked Exceptions are
 * SQLException
 * IOException
 * ClassNotFoundException
 * InvocationTargetException
 * FileNotFoundException
 */
import java.io.*;

public class CheckedException {

	public static FileInputStream f1(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		System.out.println("f1: File input stream created");
		return fis;
	}

	public static FileInputStream f2(String fileName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("f2: Oops, FileNotFoundException caught");
		} finally {
			System.out.println("f2: finally block");
		}
		System.out.println("f2: Returning from f2");
		return fis;
	}

	public static void main(String args[]) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		String fileName = "foo.bar";
		// String fileName = null;

		System.out.println("main: Starting " + CheckedException.class.getName() + " with file name = " + fileName);

		// get file input stream 1
		try {
			fis1 = f1(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("main: Oops, FileNotFoundException caught");
		} catch (Exception ex) {
			System.out.println("main: Oops, genreal exception caught");
		}

		// get file input stream 2
		fis2 = f2(fileName);

		System.out.println("main: " + CheckedException.class.getName() + " ended");
	}
}