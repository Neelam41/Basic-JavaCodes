//7. Read text from a .txt file using BufferedReader
package javaio;

import java.io.BufferedReader;
import java.io.FileReader;

public class IO7 {

	 public static void main(String args[])throws Exception{    
         FileReader fr=new FileReader("test.txt");    
         BufferedReader br=new BufferedReader(fr);    
 
         int i;    
         while((i=br.read())!=-1){  
         System.out.print((char)i);  
         }  
         br.close();    
         fr.close();    
   }    
}
