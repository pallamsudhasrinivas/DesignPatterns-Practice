package com.mycode.pract.designpattern.creational.factory;

public class SedanCar extends Car{
    public SedanCar(){
        super(CarType.SEDAN);
        construct();
    }
    @Override
    public void construct(){
        System.out.println("Building Sedan Car");
    }
}
