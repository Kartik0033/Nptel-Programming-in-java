 class Box {
  private int length , breadth , height ;
  public void setDimension(int l , int b , int c){
    length = l;
    breadth = b;
    height = c;
  }
  public void showDimension(){
    System.out.println("L="+length);
    System.out.println("B="+breadth);
    System.out.println("H="+height);
  }
}

public class Example {
  public static void main(String []args){
    Box smallBox = new Box();//refrence created pointing to the object of box
    smallBox.setDimension(20, 20, 30);
    smallBox.showDimension();
    smallBox = new Box();// using refrence created new object
    smallBox.showDimension();
  }
}