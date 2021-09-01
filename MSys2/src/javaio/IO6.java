//6. Write a program to write text to .txt file using FileWriter
package javaio;

import java.io.*;
import java.io.IOException;

public class IO6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fr=new FileWriter("test.txt");
	
	     fr.write("hello to jala technology");
	     fr.close();
	 	FileReader fd=new FileReader("test.txt");
	 	int ch;
	 	while((ch=fd.read())!=-1) {
	 		System.out.print((char)ch);
	 	}
	 	
         
          fd.close();
          
	}

}
