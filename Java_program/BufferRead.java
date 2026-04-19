
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead  {
  public static void main(String[] args) throws IOException
  {
      FileReader r = new FileReader("buffread.txt");
      BufferedReader  bf = new BufferedReader(r);
      int ch;
      while((ch=bf.read())!=-1){
        System.out.print((char)ch);
      }
  }
}
