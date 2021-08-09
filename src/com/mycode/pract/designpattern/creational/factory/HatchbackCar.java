package com.mycode.pract.designpattern.creational.factory;

public class HatchbackCar extends Car{

    public HatchbackCar() {
        super(CarType.HATCHBACK);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building HatchBack Car");
    }
}
