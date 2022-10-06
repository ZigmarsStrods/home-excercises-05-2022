package io.codelex.enums.practice.exercise1;

public class CardinalPointsTest {
    public static void main(String[] args) {

        for (CardinalPoints cPoint : CardinalPoints.values()) {
            System.out.println(cPoint.getFirstCapitalized() + ":" + cPoint.getDirection() + ":" + cPoint.ordinal());
        }
    }
}
