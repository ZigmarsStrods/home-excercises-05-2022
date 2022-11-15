package io.codelex.oop.exercise06;

public class ParcelTest {
    public static void main(String[] args) {

        int width = 30;
        int height = 30;
        int length = 30;
        float weight = 15;
        boolean isExpress = true;

        Parcel myParcel = new Parcel(width, height, length, weight, isExpress);

        System.out.println(myParcel.validate());

    }
}
