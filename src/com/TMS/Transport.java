package com.TMS;

public abstract class Transport {
    int power;
    int MaxSpeed;
    int weight;
    String brand;
    public void info() {
        System.out.println("Мощность - " + power);
        System.out.println("Max скорость - " + MaxSpeed);
        System.out.println("Масса - " + weight);
        System.out.println("Марка - " + brand);
    }
}
