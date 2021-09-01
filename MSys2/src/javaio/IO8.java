//8. Write text to a .txt file using BufferedWriter
package javaio;
import java.io.*;
public class IO8 {

	 public static void main(String[] args)
	    {
	       
	        FileWriter fw; 
	        try
	        {
	            fw = new FileWriter("test.txt");
	              
	            BufferedWriter bw = new BufferedWriter(fw);
	            System.out.println("Buffered Writer start writing :)");
	             	    
	            bw.write(69); 	           
	            bw.write(49); 
	 	        
	            bw.close();
	    
	        }
	        catch (IOException excpt)
	        {
	            excpt.printStackTrace();
	        }
	    }
}

