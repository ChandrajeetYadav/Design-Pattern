package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazyInitializedSingletonTest {

    @Test
    public void testLazyInitializedSingleton() {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        assertEquals(instance1, instance2);
    }
}