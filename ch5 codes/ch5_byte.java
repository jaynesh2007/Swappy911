import java.io.*;

public class ch5_byte
{
	public static void main(String args[])
	{
		try
		{
			//It is for creating a new file with output stream
			FileOutputStream fos = new FileOutputStream("byteStream.txt");
			
			String text = "Hello Byte Stream!";  // It is use to write
			
			byte b[]=text.getBytes();
			
			fos.write(b);
			
			fos.close();
			
			System.out.println("Data written using Byte Stream.");
			
			FileInputStream fis = new FileInputStream("byteStream.txt");  // It is use for to write in the file 
			
			System.out.print("Reading using Byte Stream: ");
			
			fis.read();
			
			fis.close();
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
	}
}
