package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EagerInitializedSingletonTest {

    @Test
    public void testEagerSingleton() {
        EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();
        System.out.println("Instance 1: " + obj1);
        System.out.println("Instance 2: " + obj2);
        assertEquals(obj1, obj2);
    }
}