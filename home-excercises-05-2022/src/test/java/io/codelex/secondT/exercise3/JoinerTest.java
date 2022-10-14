package io.codelex.secondT.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testWithIntegers() {

        Joiner<Integer> intJoiner = new Joiner<>("-");
        String result = intJoiner.join(1, 2, 3, 4);
        Assertions.assertEquals("1-2-3-4", result);
    }
}
