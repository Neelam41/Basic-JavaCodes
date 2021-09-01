//2. Write a program to write text to .txt file using OutputStream
package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		byte b[]={'J','A','L','A','T','E','C','H'};
		try {
			fos =new FileOutputStream("test.text");
			fos.write(b);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
