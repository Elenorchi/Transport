package com.TMS;

public abstract class Nazemnyi extends Transport {
    int AmountOfWheels;
    double FuelConsumption;
    double kilowatt;

    public void kilowatts() {
        this.kilowatt = power * 0.74;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Количество колес - " + AmountOfWheels);
        System.out.println("Расход - " + FuelConsumption);
    }
}