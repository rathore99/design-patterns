package org.example.design.patterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Pizza piza = new Pizza.Builder("large")
                .mashroom(true)
                .build();
    }
}

class Pizza{
    private final String size;
    private final boolean cheese;
    private final boolean mashroom;

    private Pizza(Builder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.mashroom = builder.mashroom;
        System.out.println("Pizza order created");
    }

    public static class Builder{
        private final String size;
        private boolean cheese =false;
        private boolean mashroom = false;

        public Builder(String size){
            this.size = size;
        }

        public Builder chese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public Builder mashroom(boolean value){
            this.cheese = value;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }


    }
}