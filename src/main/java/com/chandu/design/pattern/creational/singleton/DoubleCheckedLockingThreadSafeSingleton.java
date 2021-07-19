package com.chandu.design.pattern.creational.singleton;

public class DoubleCheckedLockingThreadSafeSingleton {
    private static DoubleCheckedLockingThreadSafeSingleton instance;

    private DoubleCheckedLockingThreadSafeSingleton() {
    }

    public static DoubleCheckedLockingThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingThreadSafeSingleton.class) {
                if (instance == null)
                    instance = new DoubleCheckedLockingThreadSafeSingleton();
            }
        }
        return instance;
    }
}
