package org.example.design.patterns.singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Instance created");
    }

    public static  Singleton getInstance() {
                if(instance ==null)
                    instance = new Singleton();
        return instance;
    }
}

// Demo: Multithreading test
public class SingletonRaceConditionTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton1 obj = Singleton1.getInstance();
            System.out.println("Got instance: " + obj.hashCode());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
