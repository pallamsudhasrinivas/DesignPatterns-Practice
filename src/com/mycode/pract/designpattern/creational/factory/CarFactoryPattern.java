package com.mycode.pract.designpattern.creational.factory;

/**
 * Introduces loose coupling between the classes
 *
 */
public class CarFactoryPattern {
    public static void main(String args[]){
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }
}
