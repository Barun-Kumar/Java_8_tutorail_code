package com.staticAndDefaultMethod;

public interface MyInterface {
    public static final float pi= 3.14f;
    public int sum(int f, int s);
    public default int subtract(int f, int s) throws Exception {
        if(f>=s){
            return f-s;
        }else{
            throw new Exception(f+ " is greater than "+s);
        }
    }

    public static String calculatorVersion(){
        return "V.0.1";
    }
}
