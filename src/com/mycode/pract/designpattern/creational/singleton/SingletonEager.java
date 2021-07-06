package com.mycode.pract.designpattern.creational.singleton;

/**
 * The instance is created irrespective of whether the instance is required
 * in runtime or not in the client application
 *
 * To solve this we can leave this object unused if its not a big object
 */
public class SingletonEager {

    private static volatile SingletonEager instance = new SingletonEager();

    // private constructor
    private SingletonEager(){

    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
