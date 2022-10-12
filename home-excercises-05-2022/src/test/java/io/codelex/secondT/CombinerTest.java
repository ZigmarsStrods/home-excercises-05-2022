package io.codelex.secondT;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinerTest {

    @Test
    void checkStringAndIntegerInput() {

        Combiner<String, Integer> stringIntCombiner = new Combiner<>("Text", 10, (a, b) -> a+"-"+b.toString());
        String result = stringIntCombiner.combine();
        Assertions.assertEquals("Text-10", result);
    }

}
