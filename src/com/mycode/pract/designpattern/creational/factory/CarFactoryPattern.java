package com.mycode.pract.designpattern.creational.factory;

/**
 * Introduces loose coupling between the classes
 *
 * Benefits of Factory Pattern
 * The creation of an object precludes its reuse without significant duplication of code.
 * The creation of an object requires access to information or resources that should not be contained within the composing class.
 * The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.
 *
 * Examples :
 * java.sql.DriverManager#getConnection()
 * java.net.URL#openConnection()
 * java.lang.Class#newInstance()
 * java.lang.Class#forName()
 */
public class CarFactoryPattern {
    public static void main(String args[]){
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }
}
