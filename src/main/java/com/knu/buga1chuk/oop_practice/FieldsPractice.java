package com.knu.buga1chuk.oop_practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FieldsPractice {
    private static final Logger LOG = LoggerFactory.getLogger(FieldsPractice.class);

    public static void main(String[] args) {

        Point point1 = new Point();
        point1.x = 11;
        point1.y = 5;

        Point point2 = new Point();
        point2.x = 8;
        point2.y = 10;

        String point1S = pointToString(point1);
        String point2S = pointToString(point1);

        LOG.info("Point: '{}'", point1S);
        LOG.info("Point: '{}'", point2S);

        Line line = new Line();
        line.start = point1;
        line.end = point2;

        String line1S = lineToString(line);
        LOG.info("Line: '{}'", line1S);
    }

    public static String pointToString(Point point) {
        String messageFormat = "{x: %d, y: %d}";
        return String.format(messageFormat, point.x, point.y);
    }

    public static String lineToString(Line line) {
        String messageFormat = "{start: %s, end: %s}";
        String startPoint = pointToString(line.start);
        String endPoint = pointToString(line.end);
        return String.format(messageFormat, startPoint, endPoint);
    }
}
