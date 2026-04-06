public class Example2 {

  int x;
  private static int y;

  public void fun1() {
    x = 10;
  }

  public static void fun2() {
    y = 10;
    System.out.println("y = " + y);
  }

  public static void main(String[] args) {
    Example2 obj1 = new Example2();

    obj1.fun1();
    System.out.println("obj1 x = " + obj1.x);

    Example2.fun2();
  }
}