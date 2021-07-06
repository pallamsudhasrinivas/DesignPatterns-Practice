package com.mycode.pract.designpattern.creational.singleton;

/**
 *  It will create an instance if the instance is null, or else it will return the reference
 *  if the instance is already created
 *
 *  Drawback: If there are two threads, both will create the instance and check if the instance is null.
 *  Now, if both the threads identify a null instance, then they’ll create an instance by sequentially
 *  going into a synchronized block. This will result in two instances at the end.
 *
 *  To resolve the issue, you can use double-checked locking method
 */
public class SingletonLazy {
    private  static volatile SingletonLazy INSTANCE = null;

    private SingletonLazy(){

    }

    public static SingletonLazy getinstance(){

        if(null==INSTANCE){
            synchronized (SingletonLazy.class){
                INSTANCE = new SingletonLazy();
            }
        }

        return INSTANCE;
    }


}
