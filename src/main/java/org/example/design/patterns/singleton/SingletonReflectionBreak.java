package org.example.design.patterns.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflectionBreak {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s2 = constructor.newInstance();

        System.out.println("Original: " + s1.hashCode());
        System.out.println("Reflection: " + s2.hashCode());
    }
}
