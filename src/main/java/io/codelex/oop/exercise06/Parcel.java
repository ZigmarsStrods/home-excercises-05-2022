package io.codelex.oop.exercise06;

public class Parcel implements Validatable {

    private final int MAX_DIMENSIONSIZE = 30;
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public boolean validate() {

        boolean condition1 = xLength + yLength + zLength <= 300;
        if (!condition1) {
            System.out.println("The sum of the dimensions (x, y, z) for Your parcel exceeds 300!");
        }
        boolean condition2 = xLength <= MAX_DIMENSIONSIZE && yLength <= MAX_DIMENSIONSIZE && zLength <= MAX_DIMENSIONSIZE;

        if (!condition2) {
            System.out.println("Size of at least one dimension of Your parcel is more than " + MAX_DIMENSIONSIZE + "!");
        }
        boolean condition3 = !isExpress && weight <= MAX_DIMENSIONSIZE;
        if (!isExpress && !condition3) {
            System.out.println("Your non-express delivery parcel is too heavy as it's weight is more than " + MAX_DIMENSIONSIZE + "!");
        }
        boolean condition4 = isExpress && weight <= 15;
        if (isExpress && !condition4) {
            System.out.println("Your Express delivery parcel is too heavy as it's weight is more than 15!");
        }
        return condition1 && condition2 && (condition3 || condition4);
    }
}
