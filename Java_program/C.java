
import mypackage.A;
import mypackage.B;// if c is inside the package no import needed

public class C {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.showA();
        obj2.showB();
    }
}