package org.example.design.patterns.singleton;


import java.util.Objects;

class Demo {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        s1.setValue(5);
        Singleton1 s2 = Singleton1.getInstance();
        s2.setValue(10);
        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() +" "+s2.hashCode());
    }
}
public class Singleton1 {
    private static Singleton1 INSTANCE ;
    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton1 that = (Singleton1) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value =0;
     private Singleton1(){
         System.out.println("constructor called");
     }
     private Singleton1(int value){
         this.value = value;
     }
     public static Singleton1 getInstance(){
         if(INSTANCE == null){
             INSTANCE = new Singleton1();
         }
         return INSTANCE;
     }

}
