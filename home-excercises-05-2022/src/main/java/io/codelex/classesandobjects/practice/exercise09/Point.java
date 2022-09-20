package io.codelex.classesandobjects.practice.exercise09;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void swapPoints(Point firstPoint, Point secondPoint) {
        Point temporaryPoint = new Point(firstPoint.x, firstPoint.y);
        firstPoint.x = secondPoint.x;
        firstPoint.y = secondPoint.y;
        secondPoint.x = temporaryPoint.x;
        secondPoint.y = temporaryPoint.y;

    }
}
