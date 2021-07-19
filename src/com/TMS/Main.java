package com.TMS;

public class Main {

    public static void main(String[] args) {

        Legkovoi lg = new Legkovoi(250, 200, 1500, "BMW", 4, 9.4);
        lg.kilowatts();
        lg.info();
        lg.kilometers();
        lg.fuel();
        lg.result();
        System.out.println ();
        Gruzovoi grz = new Gruzovoi(400,120,3000,"Belaz", 4 , 15);
        grz.gruz();
        Civil civ = new Civil (300,220, 2000, "Boeing", 50 , 150 );
        civ.people();
        Military mil = new Military( 350, 350, 2000, "Eagle", 40, 100);
        mil.fire();
    }
}
