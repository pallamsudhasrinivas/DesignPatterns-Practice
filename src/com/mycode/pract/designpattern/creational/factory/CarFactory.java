package com.mycode.pract.designpattern.creational.factory;

public class CarFactory {
    public static Car buildCar(CarType model){

        Car car = null;

        switch(model){
            case HATCHBACK:
                car = new HatchbackCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case SUV:
                car = new SUVCar();
                break;
            default:
                break;
        }
        return car;
    }
}
