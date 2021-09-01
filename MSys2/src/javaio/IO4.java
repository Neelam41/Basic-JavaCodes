//4. Write text to a .txt file using BufferedOutputStream
package javaio;
import java.io.*;  
public class IO4 {
	 
	public static void main(String args[])throws Exception{  
		
	     FileOutputStream fout=new FileOutputStream("test.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to jalatech";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	  
	     bout.close();    
	     fout.close();    
	      
	}    

}
