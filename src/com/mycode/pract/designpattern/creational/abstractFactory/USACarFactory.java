package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class USACarFactory {
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case HATCHBACK:
                car = new SmallCar(Location.USA);
                break;

            case SEDAN:
                car = new SedanCar(Location.USA);
                break;

            case SUV:
                car = new LuxuryCar(Location.USA);
                break;

            default:
                //throw some exception
                break;
        }
        return car;
    }
}
