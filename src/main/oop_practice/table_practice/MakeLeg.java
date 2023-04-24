package main.oop_practice.table_practice;

public class MakeLeg {
    public static Leg createLeg() {
        Leg leg = new Leg();
        leg.material = "iron";
        leg.withs = 5;
        leg.hight = 10;
        return leg;
    }
}
