package org.example.design.patterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class SecureSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    // Volatile ensures visibility and prevents instruction reordering
    private static volatile SecureSingleton instance;

    // Flag to prevent instantiation via reflection
    private static boolean instanceCreated = false;

    // Private constructor
    private SecureSingleton() {
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method to create the singleton");
        }
        instanceCreated = true;
    }

    // Double-checked locking for lazy & thread-safe initialization
    public static SecureSingleton getInstance() {
        if (instance == null) {
            synchronized (SecureSingleton.class) {
                if (instance == null) {
                    instance = new SecureSingleton();
                }
            }
        }
        return instance;
    }

    // Prevents creation of new instance during deserialization
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
