package com.polymorphism.override;

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
