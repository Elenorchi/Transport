package com.TMS;

import java.util.Scanner;

public class Legkovoi extends Nazemnyi {
    String BodyType = "седан";
    int passengers = 5;
    int kilometers;
    int a;
    double fuel;
    int time;

    public Legkovoi(int power, int MaxSpeed, int weight, String brand, int AmountOfWheels, double FuelConsumption) {
        this.power = power;
        this.MaxSpeed = MaxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.AmountOfWheels = AmountOfWheels;
        this.FuelConsumption = FuelConsumption;
        this.BodyType = BodyType;
    }

    @Override
    public void kilowatts() {
        super.kilowatts();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Тип кузова - " + BodyType);
        System.out.println("Количествр пассажиров - " + passengers);
        System.out.println("Мощность в киловаттах - " + kilowatt);
    }

    public void kilometers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для расчета пройденного расстояния введите время в пути (ч) : ");
        time = scan.nextInt();
        kilometers = time * MaxSpeed;
    }

    public void fuel() {
        this.fuel = (FuelConsumption / 100 * kilometers);
    }

    public void result() {
        System.out.println(" За время " + time + " ч, автомобиль " + brand + ", двигаясь с максимальной скоростью " + MaxSpeed + " км/ч, проедет " + kilometers + " км и израсходует " + fuel + " литров топлива.");

    }
}
