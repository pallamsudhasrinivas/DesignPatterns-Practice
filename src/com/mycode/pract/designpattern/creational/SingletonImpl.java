package com.mycode.pract.designpattern.creational;

public class SingletonImpl {

    public static void main(String args[]){
        // got 2 instances of SingletonEager
        SingletonEager eagerObj1 = SingletonEager.getInstance();
        SingletonEager eagerObj2 = SingletonEager.getInstance();

        // checking both the hascodes if we are getting singleton instance
        System.out.println(eagerObj1.hashCode());
        System.out.println(eagerObj2.hashCode());
    }
}
