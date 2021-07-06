package com.mycode.pract.designpattern.creational.singleton;

/**
 * Static blocks are executed during class loading before the constructor is called.
 * It is similar to Eager Intialization, except the fact that the class is created in a static block,
 * which provides an option for exception handling
 *
 * The drawback of this type of initalization is that if only two or three static fields are required
 * out of a few static fields. We can create an instance irrespective of whether it is required or not
 */
public class SingletonStaticBlock {

    private static final SingletonStaticBlock INSTANCE;

    // Creating instance in static block
    static {
        try{
            INSTANCE = new SingletonStaticBlock();
        }catch (Exception e){
            throw new RuntimeException("Its not expected",e);
        }
    }

    private SingletonStaticBlock(){

    }

    // return instance when called this method
    public SingletonStaticBlock getInstance(){
        return INSTANCE;
    }
}
