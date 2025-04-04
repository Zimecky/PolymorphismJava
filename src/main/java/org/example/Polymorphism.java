package org.example;

public class Polymorphism {

    public static int overloading(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int overloading(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

    @Override
    public String toString(){
        return "overriding";
    }
}
