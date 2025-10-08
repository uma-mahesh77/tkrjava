package Inheritance;
class Animal2 {
    void eat() {
        System.out.println("I can eat.");
    }
}

class Dog1 extends Animal2 {
    void bark() {
        System.out.println("I can bark.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();  // from Animal
        d.bark(); // from Dog
    }
}