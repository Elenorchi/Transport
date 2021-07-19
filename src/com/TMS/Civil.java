package com.TMS;

import java.util.Scanner;

public class Civil extends AirTransport {
    int AmountOfPassengers = 300;
    boolean business = true;

    public Civil(int power, int MaxSpeed, int weight, String brand, int WingsLength, int MinRunwayLength) {
        this.power = power;
        this.MaxSpeed = MaxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.WingsLength = WingsLength;
        this.MinRunwayLength = MinRunwayLength;
    }
    @Override
    public void kilowatts() {
        super.kilowatts();
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Количество пассжаиров - " + AmountOfPassengers);
        System.out.println("Наличие бизнесс-класса - " + business);
        System.out.println("Мощность в киловаттах - " + kilowatt);
    }
    public void people() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какое количество пассажиров ожидается в самолете? ");
        int people = scan.nextInt();
        if (people <= AmountOfPassengers) {
            System.out.println("Места достаточно");
        } else {
            System.out.println("Мест не хватает");
        }
    }
}
