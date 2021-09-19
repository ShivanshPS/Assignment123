package com.assignment1;

public class TestAssignment1 {
    public static void main(String[] args) {
        //If both methods have the same signature, only one implementation is possible.
        // In this case, there is no way to implement two versions of the method for
        // the two interfaces.

        Interface1 interface1 = new A();
        interface1.sampleMethod();
        Interface2 interface2 = new A();
        interface2.sampleMethod();
    }
}
