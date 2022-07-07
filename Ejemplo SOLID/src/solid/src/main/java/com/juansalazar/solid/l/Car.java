package com.juansalazar.solid.l;

public class Car implements ICar {

    @Override
    public void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }
}
