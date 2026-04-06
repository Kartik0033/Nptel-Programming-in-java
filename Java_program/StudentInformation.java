import mypackage.Information;

public class StudentInformation extends Information {
  
  public static void main(String[] args) {
      Information stud1 = new Information();
      stud1.setroll(2);
      System.out.println(stud1.getroll());
      stud1.setname("Kartik");
      System.out.println(stud1.getname());

  }
}
