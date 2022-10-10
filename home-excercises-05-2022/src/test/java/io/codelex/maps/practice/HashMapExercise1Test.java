package io.codelex.maps.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1Test {


    @Test
    void checkMapSize() {
        //Given
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");
        //When
        int result = myMap.size();
        //Then
        Assertions.assertEquals(5, result);
    }
}
