package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaticBlockSingletonTest {

    @Test
    public void testStaticSingleton() {
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        assertEquals(instance1, instance2);
    }

}