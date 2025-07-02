package org.example.design.patterns.singleton;

import java.io.Serializable;

// Safe Singleton Class
public class SafeSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    // Eager initialization (thread-safe by JVM)
    private static final SafeSingleton instance = new SafeSingleton();

    // Flag to prevent reflection attack
    private static boolean instanceCreated = false;

    private SafeSingleton() {
        if (instanceCreated) {
            throw new RuntimeException("Reflection not allowed: Use getInstance()");
        }
        instanceCreated = true;
    }

    public static SafeSingleton getInstance() {
        return instance;
    }

    // Fix Serialization: always return the same instance
    protected Object readResolve() {
        return getInstance();
    }
}
