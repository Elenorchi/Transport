package com.TMS;

import java.util.Scanner;

public class Gruzovoi extends Nazemnyi {
    double capacity = 2000;
    public Gruzovoi (int power, int MaxSpeed, int weight, String brand, int AmountOfWheels, double FuelConsumption) {
        this.power = power;
        this.MaxSpeed = MaxSpeed;
        this.weight = weight;
        this.brand=brand;
        this.AmountOfWheels=AmountOfWheels;
        this.FuelConsumption=FuelConsumption;
    }

    @Override
    public void kilowatts() {
        super.kilowatts();
    }

    @Override
    public void info() {
        super.info();
        System.out.println ("Грузоподъемность - "+capacity);
        System.out.println ("Мощность в киловаттах - "+kilowatt);
    }
    public void gruz () {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Какое кол-во груза необходимо загрузить (кг)? ");
        int kg = scan.nextInt();
        if (kg<=capacity) {
            System.out.println("Груз загружен");
        } else {
            System.out.println("Нужен грузовик побольше");

        }
    }
}
