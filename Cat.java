package com.polymorphism.override;

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Polymorphism in action
        Animal a2 = new Cat();

        a1.sound(); // Outputs "Bark"
        a2.sound(); // Outputs "Meow"
    }
}