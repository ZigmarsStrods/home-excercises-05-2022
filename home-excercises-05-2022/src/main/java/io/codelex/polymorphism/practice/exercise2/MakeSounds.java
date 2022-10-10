package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> mySoundingObjectList = new ArrayList<>();
        mySoundingObjectList.add(new Radio());
        mySoundingObjectList.add(new Parrot());
        mySoundingObjectList.add(new Firework());
        mySoundingObjectList.add(new Parrot());
        mySoundingObjectList.add(new Firework());
        mySoundingObjectList.add(new Radio());

        mySoundingObjectList.stream().forEach(Sound::playSound);
        
    }
}
