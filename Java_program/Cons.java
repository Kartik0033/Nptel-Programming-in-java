public class Cons {

 private int a ,b ,c;

    public Cons(){
      System.out.println(".This is the default constructor");
    }

    public Cons(int x, int y , int z) {
      a = x;
      b = y;
      c = z;
      System.out.println("The values are" + a + b + c + "");
    }

 public static void main(String[] args) {
   Cons obj = new Cons(3,5 ,5);
   Cons obj2 = new Cons();
 }
}

