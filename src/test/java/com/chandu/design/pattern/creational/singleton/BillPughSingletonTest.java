package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillPughSingletonTest {

    @Test
    public void testBillPughSingleton() {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        assertEquals(instance1, instance2);
    }
}