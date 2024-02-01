package com.knu.buga1chuk.oop_practice.table_practice;

public class MakeLeg {
    private MakeLeg() {
    }

    public static Leg createLeg() {
        Leg leg = new Leg();
        leg.material = "iron";
        leg.withs = 5;
        leg.height = 10;
        return leg;
    }
}
