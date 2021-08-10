package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class TestAbstractFactoryPattern {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }
}

