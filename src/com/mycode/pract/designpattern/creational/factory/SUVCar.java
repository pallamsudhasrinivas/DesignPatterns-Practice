package com.mycode.pract.designpattern.creational.factory;

public class SUVCar extends Car{

    public SUVCar(){
        super(CarType.SUV);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building SUV car");
    }
}
