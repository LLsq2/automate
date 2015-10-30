package com.appneta.automation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

public class OutputResults {

	public static void results(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5) {
		Date date = new Date();
		String filename = "results"+date.getTime()+".txt";
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(filename, "UTF-8");
			if (b1) writer.println("Web Applications: Passed");
			else writer.println("Web Applications: Failed");
			
			if (b2) writer.println("Web Dashboard: Passed");
			else writer.println("Web Dashboard: Failed");
			
			if (b3) writer.println("Web Monitors: Passed");
			else writer.println("Web Monitors: Failed");
			
			if (b4) writer.println("Comparison Views: Passed");
			else writer.println("Comparison Views: Failed");
			
			if (b5) writer.println("Events: Passed");
			else  writer.println("Events: Failed");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			

}
