package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class DefaultCarFactory {
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case HATCHBACK:
                car = new SmallCar(Location.DEFAULT);
                break;

            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;

            case SUV:
                car = new LuxuryCar(Location.DEFAULT);
                break;

            default:
                //throw some exception
                break;
        }
        return car;
    }
}
