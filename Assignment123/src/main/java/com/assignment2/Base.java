package com.assignment2;

public abstract class Base implements IMyInterface {

    public void method1() {
        System.out.println("I'm in Base class and method-1");
    }

    public void method2() {
        System.out.println("I'm in Base class and method-2");
    }

    public abstract void method3();

    public abstract void method4();
}
