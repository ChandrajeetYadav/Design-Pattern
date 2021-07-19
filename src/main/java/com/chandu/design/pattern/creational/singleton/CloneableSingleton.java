package com.chandu.design.pattern.creational.singleton;

public class CloneableSingleton implements Cloneable {

    private CloneableSingleton() {
    }

    public static CloneableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();

        // Can use any two below line to prevent breaking Singleton
        return this;
        //throw new CloneNotSupportedException();
    }

    private static class SingletonHelper {
        private static final CloneableSingleton INSTANCE = new CloneableSingleton();
    }
}
