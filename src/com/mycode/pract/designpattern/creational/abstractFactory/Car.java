package com.mycode.pract.designpattern.creational.abstractFactory;

import com.mycode.pract.designpattern.creational.factory.CarType;

public abstract class Car {

    public Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }

    private CarType model = null;
    private Location location = null;

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model- "+model + " built in "+location;
    }


}

