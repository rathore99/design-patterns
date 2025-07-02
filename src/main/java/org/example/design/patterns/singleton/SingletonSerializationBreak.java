package org.example.design.patterns.singleton;

import java.io.*;

class SingletonSerialized implements Serializable {
    private static final long serialVersionUID = 1L;
    private static SingletonSerialized instance = new SingletonSerialized();

    private SingletonSerialized() {}

    public static SingletonSerialized getInstance() {
        return instance;
    }
    public Object readResolve(){
        return instance;
    }
}

public class SingletonSerializationBreak {
    public static void main(String[] args) throws Exception {
        SingletonSerialized s1 = SingletonSerialized.getInstance();

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(s1);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonSerialized s2 = (SingletonSerialized) in.readObject();

        System.out.println("Original: " + s1.hashCode());
        System.out.println("Deserialized: " + s2.hashCode());
    }
}
