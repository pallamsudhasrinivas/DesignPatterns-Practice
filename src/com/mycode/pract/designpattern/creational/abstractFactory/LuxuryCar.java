package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class LuxuryCar extends Car{

    public LuxuryCar(Location location) {
        super(CarType.SUV, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}
