//9. Write a program to read data from properties file.
package javaio;

import java.io.FileInputStream;
import java.util.Properties;

public class IO9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis =new FileInputStream("prop.properties");
Properties p= new Properties();
p.load(fis);
String username=p.getProperty("username");
String password=p.getProperty("password");

System.out.println(username);
System.out.println(password);




	}

}
