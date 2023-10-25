package com.knu.buga1chuk.oop_practice;

public class FieldsPractice {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.x = 11;
        point1.y = 5;

        Point point2 = new Point();
        point2.x = 8;
        point2.y = 10;

        System.out.println(pointToString(point1));
        System.out.println(pointToString(point2));

        Line line1 = new Line();
        line1.start = point1;
        line1.end = point2;

        System.out.println(lineToString(line1));
    }

    public static String pointToString(Point point) {
        String messageFormat = "Point: {x: %d, y: %d}";
        return String.format(messageFormat, point.x, point.y);
    }

    public static String lineToString(Line line) {
        String messageFormat = "Line: {start: %s, end: %s}";
        String startPoint = pointToString(line.start);
        String endPoint = pointToString(line.end);
        return String.format(messageFormat, startPoint, endPoint);
    }
}
