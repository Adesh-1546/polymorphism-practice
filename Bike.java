package com.polymorphism.override;

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car();  
        Vehicle v2 = new Bike(); 

        v1.move(); 
        v2.move(); 
    }
}
