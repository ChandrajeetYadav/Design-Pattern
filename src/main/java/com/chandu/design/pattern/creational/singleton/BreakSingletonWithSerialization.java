package com.chandu.design.pattern.creational.singleton;

import java.io.*;

public class BreakSingletonWithSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton obj1 = SerializedSingleton.getInstance();
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.ser"))) {
            out.writeObject(obj1);
        }

        SerializedSingleton obj2 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"))) {
            obj2 = (SerializedSingleton) in.readObject();
        }

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
