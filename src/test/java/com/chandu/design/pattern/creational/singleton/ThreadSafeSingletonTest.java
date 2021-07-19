package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreadSafeSingletonTest {

    @Test
    public void testThreadSafeSingleton() {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        assertEquals(instance1, instance2);
    }
}