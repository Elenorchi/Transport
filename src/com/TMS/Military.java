package com.TMS;

public class Military extends AirTransport {
    boolean catapult = true;
    int rockets = 10;

    public Military (int power, int MaxSpeed, int weight, String brand, int WingsLength, int MinRunwayLength) {
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
        System.out.println ("Наличие катапультирования - "+catapult);
        System.out.println ("Количество ракет  - "+rockets);
        System.out.println ("Мощность в киловаттах - "+kilowatt);
    }
    public void fire () {
        if (rockets >0) {
            System.out.println("Ракета пущена");
            rockets = rockets - 1;
            System.out.println ("Остаток ракет "+rockets);
        }else {
            System.out.println("Ракеты закончились");
        }
    }
    public void catapult () {
        if (catapult ==true ) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("Катапультирование не удалось");
        }
    }
}
