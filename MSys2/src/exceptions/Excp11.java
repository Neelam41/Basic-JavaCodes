// Write a program to generate FileNotFoundException and IOException
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excp11 {

	  public static void main(String[] args) throws FileNotFoundException,IOException
	  {
	   
	    FileReader reader = null;
	
			reader = new FileReader("file.txt");
	
	  
	    @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(reader);

	    String data =null;
	      
	   
	 
			while ((data = br.readLine()) != null) 
		{
			    System.out.println(data);
		}
		
	  }
}

