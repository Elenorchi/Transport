package com.TMS;

public abstract class AirTransport extends Transport {
    int WingsLength;
    int MinRunwayLength;
    double kilowatt;
    public void kilowatts () {
        this.kilowatt=power*0.74;
    }
    @Override
    public void info() {
        super.info();
        System.out.println ("Размах крыльев - " +WingsLength);
        System.out.println ("Мин длина взлетной полосы - " +MinRunwayLength);
    }
}
