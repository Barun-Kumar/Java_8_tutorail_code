package com.staticAndDefaultMethod;

public class Calculator implements MyInterface {


    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.subtract(10,2));
        System.out.println(MyInterface.pi);
        System.out.println(MyInterface.calculatorVersion());

    }

    @Override
    public int sum(int f, int s) {
        return f+s;
    }


}
