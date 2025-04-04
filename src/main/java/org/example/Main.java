package org.example;

public class Main {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();

        int a = 1;
        int b = 3;
        int c = 5;
        int sum = 0;
        String text = polymorphism.toString();

        Polymorphism.overloading(a, b, c);
        System.out.println("Polymorphism - Overloading:");
        System.out.println("Sum a+b+c = " + sum);
        Polymorphism.overloading(a, b);
        System.out.println("Sum a+b = " + sum);
        System.out.println("Polymorphism - Overloading:");
        System.out.println(text);
    }
}