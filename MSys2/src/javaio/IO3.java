//3. Read text from a .txt file using BufferedInputStream
package javaio;
import java.io.*; 

public class IO3 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("test2.txt");
		BufferedInputStream bs= new BufferedInputStream(fis);
		int ch=bs.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			
		}
		bs.close();
		fis.close();
	}

}
