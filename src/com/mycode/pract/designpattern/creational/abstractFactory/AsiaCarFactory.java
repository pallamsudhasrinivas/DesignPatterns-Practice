package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public class AsiaCarFactory
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case HATCHBACK:
                car = new SmallCar(Location.ASIA);
                break;

            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;

            case SUV:
                car = new LuxuryCar(Location.ASIA);
                break;

            default:
                //throw some exception
                break;
        }
        return car;
    }
}
