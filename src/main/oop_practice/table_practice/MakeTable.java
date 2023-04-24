package main.oop_practice.table_practice;

public class MakeTable {
    public static void main(String[] args) {
        Table table = new Table();
        table.material = "wood";
        table.color = "red";
        table.hight = 5;
        table.withs = 10;
        table.legs = new Leg[5];
        Leg leg = MakeLeg.createLeg();
        table.legs[0] = leg;
    }
}
