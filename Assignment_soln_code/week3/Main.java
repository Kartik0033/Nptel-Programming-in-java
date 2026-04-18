class Vehicle {
    public void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car moves");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.move();
    }
}

// If we create a parent class reference and a child class object, then we can access only the members available in the parent class (reference type).
// ✔️ But if a method is overridden, then the child class method is executed at runtime.