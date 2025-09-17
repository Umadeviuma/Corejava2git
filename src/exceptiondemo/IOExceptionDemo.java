package exceptiondemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class IOExceptionDemo {

	public static void main(String[] args) throws Exception
	{
		try
		{
			@SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java training Notes\\demo.txt"));
			String data ="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
	      
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	

}