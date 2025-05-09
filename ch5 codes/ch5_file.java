import java.io.*;

public class ch5_file { // Class names should start with uppercase letters
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("J1.txt"); 
            fw.write("Hi I am jaynesh");
			fw.close();
			System.out.println("We are copy data for one file from other");
			FileReader fr = new FileReader("Jaynesh.txt");
			int a;
			while((a=fr.read())!=-1)
			{
				System.out.print((char)a);
			}
			fr.close();
			
        } catch (IOException e) {  // Catch must be outside the try block
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
