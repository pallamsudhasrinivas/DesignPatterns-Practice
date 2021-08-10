package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class SmallCar extends Car{

    public SmallCar(Location location) {
        super(CarType.HATCHBACK, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}
