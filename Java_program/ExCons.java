public class ExCons {
  int x;

  ExCons() {
    x = 3;
    System.out.println("Value of x = " + x);
  }

  public static void main(String[] args) {
    ExCons obj = new ExCons(); // stored reference
System.out.println(obj.x);
  }
}