package io.codelex.enums.practice.exercise1;

public enum CardinalPoints {

    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    private CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public String getFirstCapitalized() {
        String name = this.name();
        return name.charAt(0) + name.substring(1).toLowerCase();

    }
}
