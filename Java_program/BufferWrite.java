
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
  public static void main(String[] args) throws IOException {
      FileWriter fout = new FileWriter("wrrite.txt",true);
      BufferedWriter fin = new BufferedWriter(fout);

      fin.write("C++ is also OOP language");
      fin.close();

  }
}
