package Assignemt_soln_code.week2;

public class ArgumentTest{
  public static void main(String[] args) {
      Test t1 = new Test();
      t1.start();
  }

  static class Test{
    void start (){
    int a = 4;
    int b = 5;
    System.out.println(""+ 8 + 3 +"");
    System.out.println(a+b);
    System.out.println(""+ a + b + "");
    System.out.println(a + b + "");
    System.out.println(foo()+ a + b + "");
    System.out.print(a+b+foo());
    }
    
    String foo(){
      return "foo";
    }
  }
}