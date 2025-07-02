package org.example.design.patterns.singleton;

public class BasicSingleton {

    private static BasicSingleton INSTANCE = new BasicSingleton(0);
    private int value = 0;
    private BasicSingleton(int val){
        this.value = val;

    }

    public static BasicSingleton getINSTANCE(){
        return INSTANCE;
    }
}


