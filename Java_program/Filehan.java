
import java.io.File;
import java.io.IOException;

public class Filehan{
  public static void main(String[] args) throws IOException
   {
    File f1 = new File("C:\\Users\\Kartik\\OneDrive\\Desktop\\Programming in java Nptel\\Java_program\\example.txt");
    System.out.println(f1.exists());  
    if (f1.exists() == false)   { //(! fl.exists())
      f1.createNewFile();
      System.out.println("The file exist"+f1.exists());
      System.out.println("The file size"+f1.getName());
      System.out.println("Can file read"+f1.canRead());
    }
    System.out.println("The file is Deleted"+ f1.delete());
    System.out.println("THe file exists"+f1.exists());
  }
}