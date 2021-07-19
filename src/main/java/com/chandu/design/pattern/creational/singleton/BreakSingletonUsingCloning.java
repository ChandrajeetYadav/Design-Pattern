package com.chandu.design.pattern.creational.singleton;

public class BreakSingletonUsingCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableSingleton obj1 = CloneableSingleton.getInstance();
        CloneableSingleton obj2 = (CloneableSingleton) obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
