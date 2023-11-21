package com.example.adv_ff;

abstract class Person {
    private String name;
    private double weight;
    private double height;

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }
     public double getWeight() {
        return weight;
    }
     public double getHeight() {
        return height;
    }
}
