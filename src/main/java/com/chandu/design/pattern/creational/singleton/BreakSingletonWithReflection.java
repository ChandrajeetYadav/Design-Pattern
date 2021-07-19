package com.chandu.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class BreakSingletonWithReflection {
    public static void main(String[] args) {
        EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = null;
        try {
            Constructor constructor = obj1.getClass().getDeclaredConstructor();
            constructor.setAccessible(true);
            obj2 = (EagerInitializedSingleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj1);
        System.out.println(obj2);

        // This will not break singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;
        try {
            Constructor constructor1 = s1.getClass().getDeclaredConstructor();
            constructor1.setAccessible(true);
            s2 = (Singleton) constructor1.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s1);
        System.out.println(s2);
    }

    private static class Singleton {
        private static final Singleton instance = new Singleton();

        private Singleton() {
            System.setSecurityManager(new SecurityManager());
        }

        public static Singleton getInstance() {
            return instance;
        }
    }
}
