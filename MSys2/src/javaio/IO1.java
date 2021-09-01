//1. Write a program to read text from .txt file using InputStream
package javaio;

import java.io.FileInputStream;

public class IO1 {

	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("test.txt");    
     
           while(fin.read()!=-1)
           System.out.print((char)fin.read());    
 
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    
}
