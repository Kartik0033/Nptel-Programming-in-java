import java.io.FileInputStream;
import java.io.IOException;

//reading from the file existing
public class FileInputStm {
  public static void main(String[] args) throws IOException {
    FileInputStream fin =  new FileInputStream( "Read.txt");
    int i ;

    do { 
       i = fin.read();
       if (i!=-1)
       System.out.println((char)i);
    } while (i != -1);

  }
}
