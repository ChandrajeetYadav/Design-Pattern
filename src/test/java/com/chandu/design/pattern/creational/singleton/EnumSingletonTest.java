package com.chandu.design.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumSingletonTest {
    @Test
    public void testEnumSingleton() {
        EnumSingleton obj = EnumSingleton.INSTANCE;
        System.out.println(obj.getValue());
        obj.setValue(5);
        assertEquals(5, obj.getValue());
    }
}