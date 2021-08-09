package com.mycode.pract.designpattern.creational.factory;

public abstract class Car {

    private CarType model =null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }


    public Car(CarType model){
        this.model = model;
    }

    private void arrangeParts(){

    }

    protected abstract void construct();
}
