import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStm  {
  public static void main(String[] args)throws IOException {
      // File obj = new File("example.txt");
      FileOutputStream fout;  
      fout = new FileOutputStream( "example.txt" , true );
      String s = "TATA";
      int i;
      char ch[]= s.toCharArray();

      for (i=0;i<ch.length;i++ ){
        fout.write(ch[i]);
      }
      fout.close();
  }
}
