package com.polymorphism.override;

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}